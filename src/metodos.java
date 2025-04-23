public class metodos {
    public void BusquedaporInserccion(Book[] libros) {
        int n = libros.length;
        for (int i = 1; i < n; i++) {
            Book aux = libros[i];
            int j = i - 1;
            while (j >= 0 && libros[j].getName().compareToIgnoreCase(aux[j]) < 0) {
                aux = j;
            }
        }
        return libros[j + 1];

    }

public void searchByName(Book[]libros,String name){
    int left=0;
    int derecha=libros.length-1;
    while(left<=derecha){
        int mid=left + (derecha-left)/2;
       if (libros[mid]== ) {
            return mid;
    }
   }
   if (left<derecha) {
                
   }else(){
    mid=()
   }
   return -1;  
}
}