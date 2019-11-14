package Projeto;

public class Heap {
    public Vertice[] vertice;
    public int tamHeap;
    public int comp;
    
    public Heap(Vertice[] vert){
        vertice = new Vertice[vert.length];
        tamHeap = vert.length;
        comp = vert.length;        
    }  
    
    public int Pai(int i){
        return (i -1)/2;
    }
    
    public int filhoDir(int i){
        return (2*i)+2;
    }
    
    public int filhoEsq(int i){
        return (2*i)+1;
    }
    
    public void mostrar(){
        System.out.println("heap: ");
        
        for(int i = 0; i < this.tamHeap; i++){            
            System.out.print(this.vertice[i].valor + " ");
        }
        System.out.print("\n");
    }
    
    public void preencher(Vertice[] v){
        for(int i = 0; i < this.comp; i++){
            this.vertice[i] = v[i];            
        }
    }
    
    public void trocar(int a, int b){
        Vertice aux = this.vertice[a];
        int ida = vertice[a].id;
        int idb = vertice[b].id;
        
        vertice[a] = vertice[b];
        vertice[a].id = ida;
        
        vertice[b] =  aux;
        vertice[b].id = idb;      
        
    }
    
    public void Min_heapify(int i){
        int e = this.filhoEsq(i);
        int d = this.filhoDir(i);
        int menor;
        
        if((e < tamHeap) && (this.vertice[e].valor < this.vertice[i].valor)){
            menor = e;
        }else{
            menor = i;
        }
        
        if((d < tamHeap) && (this.vertice[d].valor < this.vertice[menor].valor)){
            menor = d;
        }
                
        if(menor != i){
            trocar(i, menor);
            Min_heapify(menor);
        }
    }
    
    public void construirHeap(){
        this.comp = this.tamHeap;
        
        for(int i = (this.comp/2); i >= 0; i--){
            Min_heapify(i);
        }
        
    }
    
}
