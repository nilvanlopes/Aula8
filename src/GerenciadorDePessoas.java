public class GerenciadorDePessoas {
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    public void cadastrarPessoa1(Pessoa pessoa) {
        if(pessoa1!=null)return;
        this.pessoa1 = pessoa;
    }

    public void cadastrarPessoa2(Pessoa pessoa) {
        if(pessoa2!=null)return;
        this.pessoa2 = pessoa;
    }

    public void atualizarPessoa1(Pessoa pessoa) {
        if(pessoa1==null)return;
        this.pessoa1 = pessoa;
    }

    public void atualizarPessoa2(Pessoa pessoa) {
        if(pessoa2==null)return;
        this.pessoa2 = pessoa;
    }

    public void exibirPessoa1() {
        if(pessoa1==null)return;
        System.out.println(
                "nome : " + pessoa1.getNome() + "\ncpf : " + pessoa1.getCpf() + "\nidade : " + pessoa1.getIdade());
    }

    public void exibirPessoa2() {
        if(pessoa2==null)return;
        System.out.println(
                "nome : " + pessoa2.getNome() + "\ncpf : " + pessoa2.getCpf() + "\nidade : " + pessoa2.getIdade());
    }

    public Pessoa getPessoa1() {
        return pessoa1;
    }

    public Pessoa getPessoa2() {
        return pessoa2;
    }

}
