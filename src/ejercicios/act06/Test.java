package ejercicios.act06;

class Test {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("pepe",18,100);
        System.out.println(e.toString());

        //1. ¿Es necesario el uso de this en el contructor de la clase Estudiante?
        //
        //2. ¿Es necesario el uso de super en el método toString de la clase Estudiante?

        //3. Si quitásemos el constructor de la clase Estudiante ¿daría un error de compilación?

        //4. En el método toString de la clase Empleado ¿por qué es incorrecto el acceso
        //   que se hace al atributo nombre? ¿Cómo se tendría que definir nombre en la
        //   clase Persona para evitar el error?

        //5. ¿Qué consecuencia tiene que algunos métodos de la clase Persona se hayan
        //   definido final?

        //6. Si el método toString no se hubiera definido en ninguna de las tres clases
        //   ¿daría error el sout del método main?

    }
}
