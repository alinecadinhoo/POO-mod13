public class Main {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Eduardo");
        pessoaFisica.setEndereco("avenida paulista");
        pessoaFisica.setTelefone(981167544L);
        pessoaFisica.setCpf(23166667855L);
        pessoaFisica.setIdade(20);
        pessoaFisica.setOcupacao("Empresario");
        imprimir(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Marcos");
        pessoaJuridica.setEndereco("Avenida Interlagos");
        pessoaJuridica.setTelefone(98158789L);
        pessoaJuridica.setCnpj(41787369000173L);
        pessoaJuridica.setRazaoSocial("Miguel e Helena Telas Ltda");
        pessoaJuridica.setInscricaoEstadual(395511775131L);
        imprimir(pessoaJuridica);


    }

    private static void imprimir(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome() + " Telefone: " + pessoa.getTelefone() + " Endereço: " + pessoa.getEndereco());

        if (pessoa instanceof PessoaFisica) {
            PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
            System.out.println("CPF: " + pessoaFisica.getCpf() + " Ocupação: " + pessoaFisica.getOcupacao());
        } else if (pessoa instanceof PessoaJuridica) {
            PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
            System.out.println("CNPJ: " + pessoaJuridica.getCnpj() + " Razão Social: " + pessoaJuridica.getRazaoSocial() + " Inscrição Estadual: " + pessoaJuridica.getInscricaoEstadual());
        }
    }
}