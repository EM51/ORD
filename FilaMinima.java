package Projeto;


public class FilaMinima extends Heap{
    
    public FilaMinima(Vertice[] v) {
        super(v);    
    }
    
    public int heap_minimum(FilaMinima fila){
        return fila.vertice[0].valor;
    }
    
    public Vertice heap_extractMin(){
        if(this.tamHeap < 0){
            System.out.println("error ");
        }
        
        Vertice menor_vertice = this.vertice[0];    
        this.vertice[0] = this.vertice[this.tamHeap-1];
        this.vertice[0].id = 0;        
        this.tamHeap -= 1;        
        this.Min_heapify(0);
        
        return menor_vertice;
    }
    
    public void heap_decreaseKey(int i, int chave){       
        if(chave > this.vertice[i].valor){
           
            
        }else{
            this.vertice[i].valor = chave;
            
            while((i > 0) && (this.vertice[Pai(i)].valor > this.vertice[i].valor)){
                trocar(i, Pai(i));
                i = Pai(i);
            }
        }
    }
    
    public void min_heapInsert(int chave){
        this.tamHeap += 1;
        this.vertice[this.tamHeap - 1].valor = Integer.MAX_VALUE;
        this.heap_decreaseKey((this.tamHeap - 1), chave);
        
    }
    
}
