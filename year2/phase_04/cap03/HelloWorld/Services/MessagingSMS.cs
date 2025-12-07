using System;
using System.Collections.Generic;
using System.Text;

namespace HelloWorld.Services
{
    public class MessagingSMS {
        public bool SendMessage(string text)
        {
            Console.WriteLine("Sending SMS: " + text);
            return true;
        }
    }
}
