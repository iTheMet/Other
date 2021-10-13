using System;
using Newtonsoft.Json;

namespace ServerAPI
{
    public class MRaspisanie
    {
        [JsonProperty("id")]
        public int id { get;set; }

        public string faculty { get; set; }

        [JsonProperty("formOfEdu")]
        public string formOfEdu { get; set; }

        [JsonProperty("course")]
        public int course { get; set; }

        [JsonProperty("group")]
        public string group { get; set; }


    }
}