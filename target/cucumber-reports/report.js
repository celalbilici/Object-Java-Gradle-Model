$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Register.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:tr"
    }
  ],
  "line": 2,
  "name": "Hepsiburada test",
  "description": "",
  "id": "hepsiburada-test",
  "keyword": "Özellik"
});
formatter.scenario({
  "line": 4,
  "name": "Kullanici girisi yapilarak sepete urun eklenmesi hepsiburada",
  "description": "",
  "id": "hepsiburada-test;kullanici-girisi-yapilarak-sepete-urun-eklenmesi-hepsiburada",
  "type": "scenario",
  "keyword": "Senaryo",
  "tags": [
    {
      "line": 3,
      "name": "@register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Hepsiburada sayfasini \"https://www.hepsiburada.com/\" acalim",
  "keyword": "Diyelim ki "
});
formatter.step({
  "line": 6,
  "name": "\"Giriş Yap\" secenegine tiklanir",
  "keyword": "Ve "
});
formatter.step({
  "line": 7,
  "name": "\"email\" alanına \"deneme@gmail.com\" yazılır",
  "keyword": "Ve "
});
formatter.step({
  "line": 8,
  "name": "\"password\" alanına \"test.123\" yazılır",
  "keyword": "Ve "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.hepsiburada.com/",
      "offset": 23
    }
  ],
  "location": "RegisterStep.hepsiburadaSayfasiniAcalim(String)"
});
formatter.result({
  "duration": 9475561600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Giriş Yap",
      "offset": 1
    }
  ],
  "location": "RegisterStep.secenegineTiklanir(String)"
});
formatter.result({
  "duration": 5760143570,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 1
    },
    {
      "val": "deneme@gmail.com",
      "offset": 17
    }
  ],
  "location": "RegisterStep.alanınaYazılır(String,String)"
});
formatter.result({
  "duration": 273245615,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 1
    },
    {
      "val": "test.123",
      "offset": 20
    }
  ],
  "location": "RegisterStep.alanınaYazılır(String,String)"
});
formatter.result({
  "duration": 234090457,
  "status": "passed"
});
});