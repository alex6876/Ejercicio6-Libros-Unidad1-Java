public class Libro {

    String titulo;
    String autor;
    boolean prestamo;

    public Libro(String titulo, String autor){

        this.autor = autor;
        this.titulo = titulo;
        this.prestamo = false;

    }

    public boolean PrestarLibro(){

          if(prestamo){
              System.out.println("No se puede prestar el libro "+titulo+" ya se a prestado.");
              return false;
          }


          prestamo = true;
          System.out.println("Libro "+titulo+" prestado.");
          return true;
    }

    public boolean DevolverLibro(){

        if(prestamo){
            System.out.println("Libro "+titulo+" no se puede devolver porque está disponible.");
            return false;
        }

        prestamo = true;
        System.out.println("Libro "+titulo+" devolver.");
        return true;

    }

    public void mostrarEstado(){

        System.out.println("Libro:"+titulo);
        System.out.println("Autor:"+autor);
        System.out.println("Prestamo:"+prestamo);

    }

    public static void main(String[] args) {

        Libro libro1 = new Libro ("Cien años de soledad","Gabriel Márquez");
        libro1.DevolverLibro();
        libro1.mostrarEstado();

        System.out.println("==================================");

        Libro libro2 = new Libro ("El principito", "Antoine Saint");
        libro2.PrestarLibro();
        libro2.mostrarEstado();

        System.out.println("==================================");

        Libro libro3 = new Libro("Un mundo feliz", "Aldous Huxley");
        libro3.prestamo = true;
        libro3.PrestarLibro();
        libro3.mostrarEstado();

    }
}