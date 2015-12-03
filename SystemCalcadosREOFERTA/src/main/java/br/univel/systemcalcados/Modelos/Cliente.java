package br.univel.systemcalcados.Modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author WebSystem
 */
public class Cliente {

    private int id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String cpf;
    private String rg;
    private String telRes;
    private String telCelular;
    private String email;
    private String refPessoalA_NomeCompleto;
    private String refPessoalA_Telefone;
    private String refPessoalA_Celular;
    private String refPessoalB_NomeCompleto;
    private String refPessoalB_Telefone;
    private String refPessoalB_Celular;
    private String refTrabalhoA_NomeEmpresa;
    private String refTrabalhoA_Telefone;
    private String refTraballhoA_TempoServico;
    private String refTrabalhoA_RendaSalarial;
    private String observacao;

    public Cliente() {
    }

//    public Cliente(String nome, String sobrenome, String endereco, String bairro, String cidade, String cpf, String rg, String telres, String telcelular, String email, String refpessoala_nomecompleto, String reftrabalhoa_nomeempresa, String reftrabalhoa_rendasalarial, String reftraballhoa_temposervico, String observacao, String cep, String refpessoalb_nomecompleto, String refpessoaa_telefone, String refpessoala_celular, String refpessoalb_telefone, String refpessoalb_celular, String reftrabalhoa_telefone) {
//
//    }
    public Cliente(String nome, String sobrenome, String endereco, String bairro, String cidade, String cep, String cpf, String rg, String telRes, String telCelular, String email, String refPessoalA_NomeCompleto, String refPessoalA_Telefone, String refPessoalA_Celular, String refPessoalB_NomeCompleto, String refPessoalB_Telefone, String refPessoalB_Celular, String refTrabalhoA_NomeEmpresa, String refTrabalhoA_Telefone,  String refTrabalhoA_RendaSalarial, String refTraballhoA_TempoServico, String observacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.cpf = cpf;
        this.rg = rg;
        this.telRes = telRes;
        this.telCelular = telCelular;
        this.email = email;
        this.refPessoalA_NomeCompleto = refPessoalA_NomeCompleto;
        this.refPessoalA_Telefone = refPessoalA_Telefone;
        this.refPessoalA_Celular = refPessoalA_Celular;
        this.refPessoalB_NomeCompleto = refPessoalB_NomeCompleto;
        this.refPessoalB_Telefone = refPessoalB_Telefone;
        this.refPessoalB_Celular = refPessoalB_Celular;
        this.refTrabalhoA_NomeEmpresa = refTrabalhoA_NomeEmpresa;
        this.refTrabalhoA_Telefone = refTrabalhoA_Telefone;
        this.refTraballhoA_TempoServico = refTraballhoA_TempoServico;
        this.refTrabalhoA_RendaSalarial = refTrabalhoA_RendaSalarial;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelRes() {
        return telRes;
    }

    public void setTelRes(String telRes) {
        this.telRes = telRes;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRefPessoalA_NomeCompleto() {
        return refPessoalA_NomeCompleto;
    }

    public void setRefPessoalA_NomeCompleto(String refPessoalA_NomeCompleto) {
        this.refPessoalA_NomeCompleto = refPessoalA_NomeCompleto;
    }

    public String getRefPessoalA_Telefone() {
        return refPessoalA_Telefone;
    }

    public void setRefPessoalA_Telefone(String refPessoalA_Telefone) {
        this.refPessoalA_Telefone = refPessoalA_Telefone;
    }

    public String getRefPessoalA_Celular() {
        return refPessoalA_Celular;
    }

    public void setRefPessoalA_Celular(String refPessoalA_Celular) {
        this.refPessoalA_Celular = refPessoalA_Celular;
    }

    public String getRefPessoalB_NomeCompleto() {
        return refPessoalB_NomeCompleto;
    }

    public void setRefPessoalB_NomeCompleto(String refPessoalB_NomeCompleto) {
        this.refPessoalB_NomeCompleto = refPessoalB_NomeCompleto;
    }

    public String getRefPessoalB_Telefone() {
        return refPessoalB_Telefone;
    }

    public void setRefPessoalB_Telefone(String refPessoalB_Telefone) {
        this.refPessoalB_Telefone = refPessoalB_Telefone;
    }

    public String getRefPessoalB_Celular() {
        return refPessoalB_Celular;
    }

    public void setRefPessoalB_Celular(String refPessoalB_Celular) {
        this.refPessoalB_Celular = refPessoalB_Celular;
    }

    public String getRefTrabalhoA_NomeEmpresa() {
        return refTrabalhoA_NomeEmpresa;
    }

    public void setRefTrabalhoA_NomeEmpresa(String refTrabalhoA_NomeEmpresa) {
        this.refTrabalhoA_NomeEmpresa = refTrabalhoA_NomeEmpresa;
    }

    public String getRefTrabalhoA_Telefone() {
        return refTrabalhoA_Telefone;
    }

    public void setRefTrabalhoA_Telefone(String refTrabalhoA_Telefone) {
        this.refTrabalhoA_Telefone = refTrabalhoA_Telefone;
    }

    public String getRefTraballhoA_TempoServico() {
        return refTraballhoA_TempoServico;
    }

    public void setRefTraballhoA_TempoServico(String refTraballhoA_TempoServico) {
        this.refTraballhoA_TempoServico = refTraballhoA_TempoServico;
    }

    public String getRefTrabalhoA_RendaSalarial() {
        return refTrabalhoA_RendaSalarial;
    }

    public void setRefTrabalhoA_RendaSalarial(String refTrabalhoA_RendaSalarial) {
        this.refTrabalhoA_RendaSalarial = refTrabalhoA_RendaSalarial;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean ValidarCPF(String cpf) {

        String strCpf = cpf;
        if (strCpf.equals("")) {
            return false;
        }

        int d1, d2;
        int digito1, digito2, resto;
        int digitoCPF;
        String nDigResult;

        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;

        strCpf = strCpf.replace(".", "").replace("-", "");

        for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
            digitoCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount)).intValue();

            //multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.  
            d1 = d1 + (11 - nCount) * digitoCPF;

            //para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.  
            d2 = d2 + (12 - nCount) * digitoCPF;
        }

        //Primeiro resto da divisão por 11.  
        resto = (d1 % 11);

        //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.  
        if (resto < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }

        d2 += 2 * digito1;

        //Segundo resto da divisão por 11.  
        resto = (d2 % 11);

        //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.  
        if (resto < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }

        //Digito verificador do CPF que está sendo validado.  
        String nDigVerific = strCpf.substring(strCpf.length() - 2, strCpf.length());

        //Concatenando o primeiro resto com o segundo.  
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

        //comparar o digito verificador do cpf com o primeiro resto + o segundo resto.  
        return nDigVerific.equals(nDigResult);

    }

    public boolean validEmail(String email) {

        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("O email " + email + " e valido");
            return true;
        } else {
            System.out.println("O E-mail " + email + " é inválido");
            return false;
        }
    }

    @Override
    public String toString() {
        return id+" - "+nome; //To change body of generated methods, choose Tools | Templates.
    }

}
