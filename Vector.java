public class Vector {
    private int size;
    private int count;
    private Jugador vector[];

    public Vector(int size) {
        this.size = size;
        this.count = 0;
        this.vector = new Jugador[this.size];
    }
    
    public boolean Add (Jugador sa)
    {
        if(count<size)
        {
            vector[count]=sa;
            count++;
            return true;
        }
        return false;
    }
    

    @Override
    public String toString()
    {
        String text = "";
            for (int i = 0; i < count; i++) {  
                if (vector[i] != null)          
                text += vector[i].toString() + "\n";
            }
        return text;
    }

    public double TotalRecaudado() {
        double total=0;
        for (int i=0; i < count; i++) {
            total += vector[i].getValor();
        }

        return total;
    }

    public void Jugar() {
        int valor, puntaje;
        for (int i=0; i<count; i++) {
            if (vector[i] != null) {
                puntaje = (int)(Math.random()*101);
                valor = vector[i].getValor() + 2000;
                vector[i].setPuntaje(puntaje);
                vector[i].setValor(valor);

                if (vector[i].getPuntaje() < 60) {
                    vector[i] = null;
                    count--;
                }
            }
        }
    }

    public void UltimoJuego() {
        int ultimo_puntaje=0, cont=0;
        for (int i=0; i<count; i++) {
            if (vector[i] != null) {
                vector[i].setPuntaje((int)Math.random()*100+1);
                vector[i].setValor(vector[i].getValor()+1000);

                if (ultimo_puntaje < vector[i].getPuntaje()) {
                    ultimo_puntaje = vector[i].getPuntaje();
                    cont++;
                }

                if (vector[i].getPuntaje() < 60) {
                    for (int j=0; j < count-1; j++) {
                        vector[j] = vector[j+1];
                    }
                    
                    vector[count-1] = null;
                    count--;
                }
            }
            vector[cont].setValor(vector[cont].getValor()*3);
        }
    }

    public double Porcentaje() {
        int cont=0;

        for (int i=0; i<count; i++) {
            if(vector[i].getNombre() != null)
                cont++;
        }

        return (cont/(double)456)*100;
    }
}
