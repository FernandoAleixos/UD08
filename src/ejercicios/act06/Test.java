package ejercicios.act06;

class Test {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("pepe", 18, 100);
        System.out.println(e.toString());
        /*
        * 1. ¿Es necesario el uso de this en el contructor de la clase Estudiante?
        * No, no es necesario utilizar el this en el constructor.
        *
        * 2. ¿Es necesario el uso de super en el método toString de la clase Estudiante?
        * Si, para poder imprimir sus atributos como persona.
        *
        * 3. Si  quitásemos  el  constructor de  la  clase Estudiante  ¿daría un  error de compilación?
        * No da error, solo da error en la clase Test.
        *
        * 4. En el método toString de la clase Empleado ¿por qué es incorrecto el acceso que se hace al atributo nombre?
        *   ¿Cómo se  tendría que  definir nombre  en  la clase Persona para evitar el error?
        * Porque esta definido como private. Se tendría que definir como publico o como protected.
        *
        * 5. ¿Qué consecuencia tiene que algunos métodos de la clase Persona se hayan definido final?
        *
        *
        * 6. Si el método toString no se hubiera definido en ninguna de las tres clases ¿daría error el sout del método main?
        * Si, porque estos hacen referencia al toString de la clase que heredan.
        */
    }
}
