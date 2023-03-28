package it.softwareinside.allenamento.models;

public class Metodi {
    


    /**
     * deviazione rob
     */
    public double deviazioneRob(int[] vettore){
        double numeratore = 0;
        double denominatore = 0;
        double deviazione = 0;
        try {
            for (int i = 0; i < vettore.length; i++) {
                numeratore += vettore[i] * 2;
            }
            
            double media = 0;
            for (int i = 0; i < vettore.length; i++) {
                media += vettore[i];
            }
            media /= (double)vettore.length;

            denominatore = Math.sqrt(Math.cos(media));

            deviazione = numeratore/denominatore;
            return deviazione;
        } catch (Exception e) {
            return 0;
        }
    }

    //CONSEGNA 1
    /**
     * il metodo conta quante volte un carattere passato come parametro 
     * è presente all'interno di un vettore, passato anch'esso come parametro
     * 
     * nel caso in cui non sia possibile eseguire l'operazione viene restituito il numero -1 nel browser 
     * e viene stampato in console il tipo di errore
     * 
     * @param vettore
     * @param carattere
     * @return
     */
    public static int ricorrenzaChar(char[] vettore, char carattere){
        int ricorrenza = 0;
        try {
            for (char elemento : vettore) 
                if(elemento == carattere)
                    ricorrenza++; 
            return ricorrenza;

        } catch (Exception e) {
            System.out.println("errore nella ricerca del carattere: " + e);
            return -1;

        }
    }

    //CONSEGNA 2
    /**
     * il metodo prende in ingresso un vettore di boolean
     * restituisce true se l'occorrenza del valore true è maggiore,
     * altrimenti restituisce false
     * 
     * nel caso in cui si verifichi un errore viene stampato un errore
     * 
     * @param vettore
     * @return
     */
    public static String occorrenzaMaggiore(boolean[] vettore){
        int vero = 0;
        int falso = 0;
        
        try {
            for (boolean elemento : vettore) {
                if(elemento == true)
                    vero++;
                else
                    falso++;
            }
            if(vero > falso)
                return "true";
            return "false";
        } catch (Exception e) {
            System.out.println("errore nella ricerca dell'occorrenza maggiore: " + e);
            return "errore";
        }
    }

    //CONSEGNA 3
    /**
     * il metodo prende in ingresso un vettore di stringhe
     * e una stringa, che corrisponde alla parola da censurare
     * restituisce un vettore nel quale la parola da censurare viene sostotuita da una stringa 
     * composta da tanti asterischi quante sono le lettere della parola stessa
     * 
     * @param vettore
     * @param parola
     * @return
     */
    public static String[] censura(String[] vettore, String parola){
        try {
            String censurata = "";

            for (int i = 0; i < parola.length(); i++) {
                censurata += "*";
            }

            String[] listaCensurata = new String[vettore.length];

            for (int index = 0; index < vettore.length; index++) {
                if(vettore[index].equals(parola))
                    listaCensurata[index] = censurata;
                else
                    listaCensurata[index] = vettore[index];
            } 

            return listaCensurata;
        } catch (Exception e) {
            System.out.println("errore nella censura: " + e);
            return null;
        }
    }
}
