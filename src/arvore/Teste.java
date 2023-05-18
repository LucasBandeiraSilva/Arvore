package arvore;

public class Teste {
    public static void main(String[] args) {

        Arvore<Integer> arvore = new Arvore<>();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);

        
        arvore.emOrdem(arvore.getRaiz());
        //pré ordem
        System.out.println("pre ordem");
        arvore.preOrdem(arvore.getRaiz());
        //pos ordem
        System.out.println("pos ordem");
        arvore.posOrdem(arvore.getRaiz());
    }
}
