import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        Vector Jugadores = new Vector(456);
        String menu[] = {"Crear Jugador", "Jugar", "Motrar Jugadores y Acumulado", "Porcentaje J. En juego", "Último juego", "Salir"};
        String nombre, opcion;
        int codigo=000, valor, puntaje=0;

        do {
            opcion = (String)JOptionPane.showInputDialog(null, "Seleccione una opcion", "menu", 1, null, menu, menu[0]);

            switch(opcion) {
                case "Crear Jugador":
                    nombre = (String)JOptionPane.showInputDialog("Digite el nombre");
                    valor = (int)(Math.random()*10000+1);
                    Jugador jugador = new Jugador(nombre, codigo, puntaje, valor);
                    if (Jugadores.Add(jugador)) {
                        JOptionPane.showMessageDialog(null, "Jugador creado");
                        codigo++;
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Maxima capacidad de jugadores");
                    break;
                case "Jugar":
                    Jugadores.Jugar();
                    JOptionPane.showMessageDialog(null, "Juego corrido.");
                    break;
                case "Motrar Jugadores y Acumulado":
                    JOptionPane.showMessageDialog(null, Jugadores.toString());
                    break;
                case "Porcentaje J. En juego":
                    JOptionPane.showMessageDialog(null, "El porcentaje de jugadores que aún juegan " +
                    "es: " + String.format("%.2f", Jugadores.Porcentaje()) + "%");
                    if (Jugadores.TotalRecaudado() < 500000)
                        JOptionPane.showMessageDialog(null, "Y el acumulado aún no supera el monto de 500000");
                    else if (Jugadores.TotalRecaudado() > 500000)
                        JOptionPane.showMessageDialog(null, "Y el acumulado es superior a 500000");
                    else
                        JOptionPane.showMessageDialog(null, "Y el acumulado es de 500000");
                break;
                case "Último juego":
                    Jugadores.UltimoJuego();
                    JOptionPane.showMessageDialog(null, "Juego corrido.");
                break;
                case "Salir":
                    opcion = null;
                    break;
            }

        } while (opcion != null);
    }
}
