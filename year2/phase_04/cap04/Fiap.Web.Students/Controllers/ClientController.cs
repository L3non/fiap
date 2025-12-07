using Fiap.Web.Students.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;

namespace Fiap.Web.Students.Controllers
{
    public class ClientController : Controller
    {
        // List to store clients
        public IList<ClientModel> clients { get; set; }

        // List to store representatives
        public IList<RepresentativeModel> representatives { get; set; }

        public ClientController()
        {
            // Simulates searching for customers in the database
            clients = GenerateMockedClients();
            representatives = GenerateMockedRepresentatives();
        }

        public IActionResult Index()
        {
            // Avoiding null values
            if (clients == null)
            {
                clients = new List<ClientModel>();
            }

            return View(clients);
        }

        // Note on the use of the HTTP Get verb
        [HttpGet]
        public IActionResult Create()
        {
            Console.WriteLine("Executed the Action Register()");

            // Creates the variable to store the SelectList
            var selectListRepresentatives = new SelectList(representatives,
                                                            nameof(RepresentativeModel.RepresentativeId),
                                                            nameof(RepresentativeModel.RepresentativeName));

            // Add the SelectList to the ViewBag to be sent to the View.
            // The Representatives property is dynamically created in the ViewBag
            ViewBag.Representatives = selectListRepresentatives;

            // Returns to the Create View one
            // Model object with blank properties
            return View(new ClientModel());
        }

        [HttpPost]
        public IActionResult Create(ClientModel clientModel)
        {
            Console.WriteLine("Client successfully registered");

            TempData["successMessage"] = "Client successfully registered";

            return RedirectToAction(nameof(Index));

            // The nameof(Index) section could be used as follows
            // return RedirectToAction("Index");
        }

        // Note on the use of the HTTP Get verb
        [HttpGet]
        public IActionResult Edit(int id)
        {
            var selectListRepresentatives = new SelectList(representatives,
                                                            nameof(RepresentativeModel.RepresentativeId),
                                                            nameof(RepresentativeModel.RepresentativeName));

            ViewBag.Representatives = selectListRepresentatives;

            // Simulating a database search
            var clientConsulted = clients.Where(c => c.ClientId == id).FirstOrDefault();

            // Returning the queried client to the View
            return View(clientConsulted);
        }

        [HttpPost]
        public IActionResult Edit(ClientModel clientModel)
        {
            TempData["successMessage"] = $"The client data for {clientModel.Name} has been successfully updated";
            return RedirectToAction(nameof(Index));
        }

        // Note on the use of the HTTP Get verb.
        [HttpGet]
        public IActionResult Details(int id)
        {
            var selectListRepresentatives =
                new SelectList(representatives,
                                nameof(RepresentativeModel.RepresentativeId),
                                nameof(RepresentativeModel.RepresentativeName));
            ViewBag.Representatives = selectListRepresentatives;
            // Simulating a database search
            var clientConsulted =
                clients.Where(c => c.ClientId == id).FirstOrDefault();
            // Returning the queried client to the View
            return View(clientConsulted);
        }

        // Note on the use of the HTTP Get verb
        [HttpGet]
        public IActionResult Delete(int id)
        {
            // Simulating a database search
            var clientConsulted =
                clients.Where(c => c.ClientId == id).FirstOrDefault();
            if (clientConsulted != null)
            {
                TempData["successMessage"] = $"The client data for {clientConsulted.Name} has been successfully removed";
            }
            else
            {
                TempData["successMessage"] = $"OPS !!! Non-existent customer.";
            }
            return RedirectToAction(nameof(Index));
        }


        /*
         * This static method GenerateMockedClients
         * creates a list of 5 clints with fictitious data
         */
        public static List<ClientModel> GenerateMockedClients()
        {
            var clients = new List<ClientModel>();

            for (int i = 1; i <= 5; i++)
            {
                var client = new ClientModel
                {
                    ClientId = i,
                    Name = "Client " + i,
                    Email = "Client" + i + "@example.com",
                    DateOfBirth = DateTime.Now.AddYears(-30),
                    Observation = "Observation for Client " + i,
                    RepresentativeId = i,
                    Representative = new RepresentativeModel
                    {
                        RepresentativeId = i,
                        RepresentativeName = "Representative " + i,
                        Cpf = "00000000191"
                    }
                };

                clients.Add(client);
            }

            return clients;
        }

        /*
         * This static method GenerateMockedRepresentatives
         * creates a list of 5 representatives with fictitious data
         */
        public static List<RepresentativeModel> GenerateMockedRepresentatives()
        {
            var representatives = new List<RepresentativeModel>();

            for (int i = 1; i <= 5; i++)
            {
                var representative = new RepresentativeModel
                {
                    RepresentativeId = i,
                    RepresentativeName = "Representative " + i,
                    Cpf = "111.111.111-" + i
                };

                representatives.Add(representative);
            }

            return representatives;
        }
    }
}


