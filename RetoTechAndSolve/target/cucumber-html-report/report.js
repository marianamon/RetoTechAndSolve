$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AgregarLibros.feature");
formatter.feature({
  "line": 1,
  "name": "Agregar a la canasta de compra los libros",
  "description": "Como usuario del aplicativo quiero Agregar libros y obtener el valor correcto\r\nal totalizar costo unitario, costo total y el gran total.",
  "id": "agregar-a-la-canasta-de-compra-los-libros",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "El usuario agrega libros a la canasta de compra y obtiene valor grantotal exitosamente",
  "description": "",
  "id": "agregar-a-la-canasta-de-compra-los-libros;el-usuario-agrega-libros-a-la-canasta-de-compra-y-obtiene-valor-grantotal-exitosamente",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Que he ingresado a la pagina \"http://sahitest.com/demo/training/books.htm\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he agregado \"2\" core Java",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "he agregado \"5\" ruby for rail",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "he agregado \"2\" Python Cookbook",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "de click en el boton Add",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "deberia presentar My cart con articulos y grantotal correctos",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sahitest.com/demo/training/books.htm",
      "offset": 30
    }
  ],
  "location": "Comunes_Steps.navigateTo(String)"
});
formatter.result({
  "duration": 11794031581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "AgregarLibros_Steps.heagregadocoreJava(String)"
});
formatter.result({
  "duration": 314223467,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 13
    }
  ],
  "location": "AgregarLibros_Steps.heagregadorubyforail(String)"
});
formatter.result({
  "duration": 189437556,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    }
  ],
  "location": "AgregarLibros_Steps.heagregadoPythonCookbook(String)"
});
formatter.result({
  "duration": 231415852,
  "status": "passed"
});
formatter.match({
  "location": "AgregarLibros_Steps.clickenadd()"
});
formatter.result({
  "duration": 121088263,
  "status": "passed"
});
formatter.match({
  "location": "AgregarLibros_Steps.verificarRespuesta()"
});
formatter.result({
  "duration": 37381,
  "status": "passed"
});
formatter.uri("GenerarAlertas.feature");
formatter.feature({
  "line": 1,
  "name": "Navegar entre alertas",
  "description": "Como usuario del aplicativo quiero navegar entre las alertas \r\npresentadas hasta retornar a la pagina de inicio",
  "id": "navegar-entre-alertas",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "El usuario navega entre alertas Exitosamente",
  "description": "",
  "id": "navegar-entre-alertas;el-usuario-navega-entre-alertas-exitosamente",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Que he ingresado a la pagina \"http://sahitest.com/demo/jsPopup.htm\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he dado click en el boton All popup this page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "he aceptado la alerta Show Alert",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "he aceptado la alerta Show confirm",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "he ingresado un valor en el campo de alerta show prompt",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "de click en el boton cancelar de la ventana imprimir",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "deberia retornar a la pagina inicial Js popup Test",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sahitest.com/demo/jsPopup.htm",
      "offset": 30
    }
  ],
  "location": "Comunes_Steps.navigateTo(String)"
});
formatter.result({
  "duration": 8789430759,
  "status": "passed"
});
formatter.match({
  "location": "Alertas_Steps.clickbotonAllpopupthispage()"
});
formatter.result({
  "duration": 194195451,
  "status": "passed"
});
formatter.match({
  "location": "Alertas_Steps.aceptarlaalertaShowAlert()"
});
formatter.result({
  "duration": 44884536,
  "status": "passed"
});
formatter.match({
  "location": "Alertas_Steps.aceptarlaalertaShowconfirm()"
});
formatter.result({
  "duration": 27029497,
  "status": "passed"
});
formatter.match({
  "location": "Alertas_Steps.aceptarlaalertaShowprompt()"
});
formatter.result({
  "duration": 32272960,
  "status": "passed"
});
formatter.match({
  "location": "Alertas_Steps.clickencancelar()"
});
formatter.result({
  "duration": 1490110782,
  "status": "passed"
});
formatter.match({
  "location": "Alertas_Steps.retornarpaginainicio()"
});
formatter.result({
  "duration": 1387022927,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Inicio de sesion Exitosa",
  "description": "Como usuario del aplicativo quiero acceder a mi vista predeterminda al ingresar \r\nusuario y contraseña correctas",
  "id": "inicio-de-sesion-exitosa",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "El usuario inicia sesion en aplicativo de manera exitosa",
  "description": "",
  "id": "inicio-de-sesion-exitosa;el-usuario-inicia-sesion-en-aplicativo-de-manera-exitosa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Que he ingresado a la pagina \"http://sahitest.com/demo/training/login.htm\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he Ingresado nombre de usuario \"test\" Y Password \"secret\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "de click en el boton login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "deberia acceder al aplicativo",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sahitest.com/demo/training/login.htm",
      "offset": 30
    }
  ],
  "location": "Comunes_Steps.navigateTo(String)"
});
formatter.result({
  "duration": 3976569603,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 32
    },
    {
      "val": "secret",
      "offset": 50
    }
  ],
  "location": "Login_Steps.userEnterusernameandpassword(String,String)"
});
formatter.result({
  "duration": 406586141,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.userClickOnSubmitButton()"
});
formatter.result({
  "duration": 615790050,
  "status": "passed"
});
formatter.match({
  "location": "Login_Steps.Ingresaraplicativo()"
});
formatter.result({
  "duration": 959487472,
  "status": "passed"
});
formatter.uri("NavegarIframeTest.feature");
formatter.feature({
  "line": 1,
  "name": "Navegar en opciones de menu del IframeTest",
  "description": "Como usuario del aplicativo quiero navegar entre las opciones dispuestas en la\r\nopcion de menu IframeTest",
  "id": "navegar-en-opciones-de-menu-del-iframetest",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "El usuario igresa a la opcion Window Open Test",
  "description": "",
  "id": "navegar-en-opciones-de-menu-del-iframetest;el-usuario-igresa-a-la-opcion-window-open-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Que he ingresado a la pagina \"http://sahitest.com/demo/jsPopup.htm\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Que he Ingresado al link IframeTest",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "ingrese a la opcion Window open test",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "deberia visualizar la pagina Window Open test",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sahitest.com/demo/jsPopup.htm",
      "offset": 30
    }
  ],
  "location": "Comunes_Steps.navigateTo(String)"
});
formatter.result({
  "duration": 5351829379,
  "status": "passed"
});
formatter.match({
  "location": "SahiTest_Steps.QueheIngresadoallink()"
});
formatter.result({
  "duration": 1377667608,
  "status": "passed"
});
formatter.match({
  "location": "SahiTest_Steps.ingresealaopcionWindowOpentest()"
});
formatter.result({
  "duration": 466570887,
  "status": "passed"
});
formatter.match({
  "location": "SahiTest_Steps.deberiaingresar()"
});
formatter.result({
  "duration": 942464998,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "El usuario igresa a la opcion de Error Page",
  "description": "",
  "id": "navegar-en-opciones-de-menu-del-iframetest;el-usuario-igresa-a-la-opcion-de-error-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Que he ingresado a la pagina \"http://sahitest.com/demo/jsPopup.htm\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Que he Ingresado al link IframeTest",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "ingrese a la opcion Error Pages",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "seleccione la opcion 404 page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "deberia visualizar un mensaje indicando",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sahitest.com/demo/jsPopup.htm",
      "offset": 30
    }
  ],
  "location": "Comunes_Steps.navigateTo(String)"
});
formatter.result({
  "duration": 5698186480,
  "status": "passed"
});
formatter.match({
  "location": "SahiTest_Steps.QueheIngresadoallink()"
});
formatter.result({
  "duration": 813630666,
  "status": "passed"
});
formatter.match({
  "location": "SahiTest_Steps.ingresealaopcionErrorPages()"
});
formatter.result({
  "duration": 234497289,
  "status": "passed"
});
formatter.match({
  "location": "SahiTest_Steps.seleccionelaopcion404page()"
});
formatter.result({
  "duration": 155985410,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: unhandled inspector error: {\"code\":-32000,\"message\":\"Cannot find context with specified id\"}\n  (Session info: chrome\u003d68.0.3440.84)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 144 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-0MGKS9K\u0027, ip: \u0027192.168.175.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73), userDataDir\u003dC:\\Users\\user\\AppData\\Local\\Temp\\scoped_dir30140_13139}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d68.0.3440.84, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 268935e543bf9385a7d7e0b38976219d\n*** Element info: {Using\u003dname, value\u003dError Pages}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:461)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat pages.SahitestPage.clickError404(SahitestPage.java:93)\r\n\tat stepDefinition.SahiTest_Steps.seleccionelaopcion404page(SahiTest_Steps.java:56)\r\n\tat ✽.And seleccione la opcion 404 page(NavegarIframeTest.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SahiTest_Steps.deberia_visualizar_un_mensaje_indicando()"
});
formatter.result({
  "status": "skipped"
});
});