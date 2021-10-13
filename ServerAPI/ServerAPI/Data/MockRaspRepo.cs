using System.Collections.Generic;
using System.IO;
using Newtonsoft.Json;

namespace ServerAPI.Data
{
    public class MockRaspRepo : IRaspRepo
    {
        public IEnumerable<MRaspisanie> GetAllRasp()
        {
            var rasps = new List<MRaspisanie>();
            int index = new DirectoryInfo("P:/ITheM/Documents/TESTJSON").GetFiles().Length;
            for (int i = 0; i < index; i++)
            {
                rasps.Add(JsonConvert.DeserializeObject<MRaspisanie>(File.ReadAllText($"P:/ITheM/Documents/TESTJSON/DATA{i+1}.json")));
            }
            
            
            
            return rasps;
        }

        public MRaspisanie GetRaspById(int id)
        {
            var rasp = File.Exists($"P:/ITheM/Documents/TESTJSON/DATA{id}.json") ?
                JsonConvert.DeserializeObject<MRaspisanie>(File.ReadAllText($"P:/ITheM/Documents/TESTJSON/DATA{id}.json")) : new MRaspisanie()
                {
                    id = 0000,
                    faculty = "\nГЫЧА\n",
                    formOfEdu = "ОРОЧЬЯ\n",
                    course = -1,
                    group = "\nUTF-8?\n"
                };
            
            return rasp;
          // return new MRaspisanie(){id = 000, faculty = "Null", formOfEdu = "Null", course = 0, group = "Null"};
        }
    }
    
}