namespace Fiap.Web.Students.Models
{
    public class ClientModel
    {
        public int ClientId { get; set; }
        public string? Name { get; set; }
        public string? LastName { get; set; }
        public string? Email { get; set; }
        public DateTime DateOfBirth { get; set; }
        public string? Observation { get; set; }
        public int RepresentativeId { get; set; }
        public RepresentativeModel? Representative { get; set; }
    }
}
