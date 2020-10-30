

//vamos a crear una funcion que se encargue del cifrado de cesar
//let 
var cesar = cesar || (function () {
    //funcion anonima :3 
    //callback
    var doStaff = function (txt, desp, action) {
        var replace = (function () {
            //mi abecedario
            var abc = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];
            var l = abc.length;

            //funcion que se encarga de cifrar
            return function (c) {
                var i = abc.indexOf(c.toLowerCase());

                //vamos a verificar que no este vacio
                if (i != -1) {
                    var pos = i;
                    if (action) {
                        //avanzar
                        //en el algoritmo cesar se cifra por desplazamiento
                        pos += desp;
                        pos -= (pos >= l) ? l : 0;
                    } else {
                        //retrocedo
                        //descifrar por le mismo desplazamiento
                        pos -= desp;
                        pos += (pos < 0) ? l : 0;
                    }
                    return abc[pos];
                }
                return c;
            };
        })();
        //aqui es donde tenemos que hacer el match
        var re = (/([a-z ñ ])/ig);
        return String(txt).replace(re, function (match) {
            return replace(match);
        });
    };

    return {
        encode: function (txt, desp) {
            return doStaff(txt, desp, true);
        },
        decode: function (txt, desp) {
            return doStaff(txt, desp, false);
        }
    };
})();

//realizar una funcion que se encargue de codificar y decodificar

function codificar() {

    var a = parseInt(formulario.Posicion.value);

    if (a < 0) {
        alert("Error: El numero ingresado es menor a 0");

    }

    if (a > 53) {
        alert("Error: El numero ingresado es mayor a 53, ingrese un numero menor");

    }

    if (formulario.Posicion.value == 0) {
        alert("El campo posicion esta vacio");
        formulario.Posicion.value = "";
        formulario.Posicion.focus();
        return false;

    }

    var checkStr = formulario.Posicion.value; var checkOK = "0123456789";
    var allValido = true;
    for (var i = 0; i < checkStr.length; i++) {
        var ch = checkStr.charAt(i);

        for (var j = 0; j < checkOK.length; j++) {
            if (ch == checkOK.charAt(j)) {
                break;
            }
        }
        if (j == checkOK.length) {
            allValido = false;
            break;
        }
    }
    if (!allValido) {
        alert("Escriba solo digitos numericos enteros en el campo posicion");
        formulario.Posicion.focus();
        return (false);
    }



    if (a > 0 && a <= 53) {
        //obtener el texto del textarea
        document.getElementById("resultado").innerHTML = cesar.encode(document.getElementById("cadena").value, a);

    }




}



function decodificar() {


    var a = parseInt(formulario.Posicion.value);

    if (a < 0) {
        alert("Error: El numero ingresado es menor a 0");

    }

    if (a > 53) {
        alert("Error: El numero ingresado es mayor a 53, ingrese un numero menor");

    }

    if (formulario.Posicion.value == 0) {
        alert("El campo posicion esta vacio");
        formulario.Posicion.value = "";
        formulario.Posicion.focus();
        return false;

    }

    var checkStr = formulario.Posicion.value; var checkOK = "0123456789";
    var allValido = true;
    for (var i = 0; i < checkStr.length; i++) {
        var ch = checkStr.charAt(i);

        for (var j = 0; j < checkOK.length; j++) {
            if (ch == checkOK.charAt(j)) {
                break;
            }
        }
        if (j == checkOK.length) {
            allValido = false;
            break;
        }
    }
    if (!allValido) {
        alert("Escriba solo digitos numericos enteros en el campo posicion");
        formulario.Posicion.focus();
        return (false);
    }

    if (a > 0 && a <= 53) {
        //obtener el texto del textarea
        document.getElementById("resultado").innerHTML = cesar.decode(document.getElementById("cadena").value, a);

    }


}
