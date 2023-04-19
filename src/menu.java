public class menu{

        private int opcao;

    public menu() {
        this.opcao = 0;
    }

    public void setopcao(int op) {
        this.opcao = op;

    }

    public int getopcao(){
        return this.opcao;
    }

    public void  getMenu(){
        System.out.println("Selecione uma opcão");
        System.out.println("0 - soma");
        System.out.println("1 - subitracion");
        System.out.println("2 - multiplication");
        System.out.println("3 - division");
    }

    public void solicitarNumero(int numero){
            System.out.println("Digite o valor" + numero + "ª");

    }

}