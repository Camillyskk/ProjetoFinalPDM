//package com.example.projetopdm.usuarios;
//
//public class Cliente {
//    String cidade;
//    String sobrenome;
//    String dataNascimento;
//    String sexoBiologico;
//    String rg;
//    String cpf;
//    String remedios;
//    private ArrayList<Agendamento> horarios = new ArrayList<>();
//
//    public static void cadastrar() {
//        System.out.println("\n\nCadastro de Clientes da Clinica\n");
//
//        Cliente client = new Cliente();
//
//        System.out.println("Nome do cliente:");
//        client.setNome(leitor.nextLine());
//
//        System.out.println("Sobrenome:");
//        client.setSobrenome(leitor.nextLine());
//
//        System.out.println("Data de nascimento -no formato xx/xx/xxxx-:");
//        client.setdataNascimento(leitor.nextLine());
//
//        System.out.println("RG:");
//        client.setRg(leitor.nextLine());
//
//        System.out.println("CPF:");
//        client.setCpf(leitor.nextLine());
//
//        System.out.println("Telefone:");
//        client.setTelefone(leitor.nextLine());
//
//        System.out.println("Sexo biologico:");
//        client.setSexo(leitor.nextLine());
//
//        System.out.println("Cidade:");
//        client.setCidade(leitor.nextLine());
//
//        System.out.println("Remedios usados com frequencia:");
//        client.setRemedios(leitor.nextLine());
//
//        System.out.println("Email:");
//        client.setEmail(leitor.nextLine());
//
//        boolean valido = false;
//        while(!valido){
//            int cont = 0;
//            System.out.println("Nome de usuario:");
//            String addnome = leitor.nextLine();
//            for (Usuario usuarioProcurado : Agenda.usuarios) {
//                if (usuarioProcurado.getNomeUsuario().equals(addnome)) {
//                    System.out.println("Esse usuário já existe, crie outro nome\n");
//                } else{
//                    cont++;
//                }
//            }
//            if(cont == Agenda.usuarios.size()){
//                client.setNomeUsuario(addnome);
//                valido = true;
//            }
//        }
//
//        System.out.println("Senha:");
//        client.setSenha(leitor.nextLine());
//
//        Agenda.listaClientes.add(client);
//        Agenda.usuarios.add(client);
//    }
//
//    public static void listar() {
//        for (int i = 0; i < Agenda.listaClientes.size(); i++) {
//            if (i == 0) {
//                System.out.println("\n----------- LISTA de CLIENTES -----------\n");
//            }
//            System.out.println("Cliente nº: " + (i + 1));
//            System.out.println("Nome completo: " + Agenda.listaClientes.get(i).getSobrenome());
//            System.out.println("Email: " + Agenda.listaClientes.get(i).getEmail());
//            System.out.println("Nome de Usuário: " + Agenda.listaClientes.get(i).getNomeUsuario());
//            System.out.println("Senha: " + Agenda.listaClientes.get(i).getSenha());
//            System.out.println("Data de Nascimento: " + Agenda.listaClientes.get(i).getDataNascimento());
//            System.out.println("Cidade: " + Agenda.listaClientes.get(i).getCidade());
//            System.out.println("Telefone: " + Agenda.listaClientes.get(i).getTelefone());
//            System.out.println("CPF: " + Agenda.listaClientes.get(i).getCpf());
//            System.out.println("RG: " + Agenda.listaClientes.get(i).getRg());
//            System.out.println("Sexo Biologico: " + Agenda.listaClientes.get(i).getSexo());
//            System.out.println("Remédios que usa com frequência: " + Agenda.listaClientes.get(i).getRemedios());
//
//            if (i != Agenda.listaClientes.size() - 1) {
//                System.out.println("\n             ..........\n");
//            }
//            if (i == Agenda.listaClientes.size() - 1) {
//                System.out.println("\n****************************************\n");
//            }
//        }
//    }
//
//    public static void deletar() {
//
//        if (Agenda.sessao instanceof Gerente) {
//            listar();
//            System.out.println("\n Digite o ID do cliente que deseja deletar:");
//            Integer id = Integer.parseInt(leitor.nextLine());
//            for (int i = 0; i < Agenda.usuarios.size(); i++){ //remove da lista de usuarios
//                if(Agenda.usuarios.get(i).getNomeUsuario().equals(Agenda.listaClientes.get(id-1).getNomeUsuario())){
//                    Agenda.usuarios.remove(i);
//                }
//            }
//            System.out.println("O cliente " + Agenda.listaClientes.get(id-1).getNomeUsuario() + " foi deletado com sucesso");
//            Agenda.listaClientes.remove(id - 1);
//
//        } else if (Agenda.sessao instanceof Cliente) {
//            for (int j = 0; j < Agenda.usuarios.size(); j++){ //remove da lista de usuarios
//                if(Agenda.usuarios.get(j).getNomeUsuario().equals(Agenda.sessao.getNomeUsuario())){
//                    Agenda.usuarios.remove(j);
//                }
//            }
//            for (int i = 0; i < Agenda.listaClientes.size(); i++) { //remove da lista de clientes
//                if (Agenda.sessao.getNomeUsuario().equals(Agenda.listaClientes.get(i).getNomeUsuario())) {
//                    System.out.println("O cliente " + Agenda.listaClientes.get(i).getNomeUsuario() + " foi deletado com sucesso");
//                    Agenda.listaClientes.remove(i);
//                    Agenda.sessao = null;
//                    Menu.inicial();
//                }
//            }
//        } else {
//            System.out.println("Você não tem permissão para deletar esse usuário");
//        }
//
//    }
//
//    public static void editar() {
//        Cliente cliente = (Cliente) Agenda.sessao;
//
//        System.out.println("\nNome de usuario atual: " + cliente.getNomeUsuario());
//        boolean valido = false;
//        while(!valido){
//            int cont = 0;
//            System.out.println("Novo nome de usuario:");
//            String addnome = leitor.nextLine();
//            for (Usuario usuarioProcurado : Agenda.usuarios) {
//                if (usuarioProcurado.getNomeUsuario().equals(addnome)) {
//                    System.out.println("Esse usuário já existe, crie outro nome\n");
//                } else{
//                    cont++;
//                }
//            }
//            if(cont == Agenda.usuarios.size()){
//                cliente.setNomeUsuario(addnome);
//                valido = true;
//            }
//        }
//
//        System.out.println("\nEmail atual: " + cliente.getEmail());
//        System.out.println("Novo email:");
//        cliente.setEmail(leitor.nextLine());
//
//        System.out.println("\nTelefone atual: " + cliente.getTelefone());
//        System.out.println("Novo telefone:");
//        cliente.setTelefone(leitor.nextLine());
//
//        System.out.println("\nCidade atual: " + cliente.getCidade());
//        System.out.println("Nova cidade:");
//        cliente.setCidade(leitor.nextLine());
//    }
//
//    public static void verHorario() {
//        Usuario user = Agenda.sessao;
//        if (user instanceof Cliente){
//            Cliente cliente = (Cliente) Agenda.sessao;
//            for(int i = 0; i < cliente.horarios.size(); i++){
//                if (i == 0){
//                    System.out.println("\n------- LISTA DE AGENDAMENTOS -------\n"); //usa pra listar e deletar
//                }
//                System.out.println("ID: " + (i+1));
//                System.out.println("Procedimento: " + cliente.horarios.get(i).procedimento.nome);
//                System.out.println("Data: " + cliente.horarios.get(i).data);
//                System.out.println("Horario: " + cliente.horarios.get(i).horario);
//
//                if (i != cliente.horarios.size() - 1) {
//                    System.out.println("\n             ..........\n");
//                }
//                if (i == cliente.horarios.size() - 1) {
//                    System.out.println("\n****************************************\n");
//                }
//            }
//        } else if(user instanceof Adm){
//            listar();
//            System.out.println("\n Digite o ID do cliente que deseja visualizar a agenda:");
//            Integer id = Integer.parseInt(leitor.nextLine());
//
//            for (int j = 0; j < Agenda.listaClientes.size(); j++){
//                if(Agenda.listaClientes.get(j).getNomeUsuario().equals(Agenda.listaClientes.get(id-1).getNomeUsuario())){
//                    for(int i = 0; i < Agenda.listaClientes.get(j).horarios.size(); i++){
//                        if (i == 0){
//                            System.out.println("\n------- LISTA DE AGENDAMENTOS -------\n");
//                            System.out.println("Cliente: " + Agenda.listaClientes.get(j).getNomeUsuario() + "\n");
//                        }
//                        System.out.println("ID: " + (i+1));
//                        System.out.println("Procedimento: " + Agenda.listaClientes.get(j).horarios.get(i).procedimento.nome);
//                        System.out.println("Data: " + Agenda.listaClientes.get(j).horarios.get(i).data);
//                        System.out.println("Horario: " + Agenda.listaClientes.get(j).horarios.get(i).horario);
//
//                        if (i != Agenda.listaClientes.get(j).horarios.size() - 1) {
//                            System.out.println("\n             ..........\n");
//                        }
//                        if (i == Agenda.listaClientes.get(j).horarios.size() - 1) {
//                            System.out.println("\n****************************************\n");
//                        }
//                    }
//                }
//            }
//        } else {
//            System.out.println("Você nao tem permissao para ver esse agenda");
//        }
//    }
//
////SETTER
//
//    public void setSobrenome(String sobrenome) {
//        this.sobrenome = sobrenome;
//    }
//
//    public void setdataNascimento(String dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }
//
//    public void setRg(String rg) {
//        this.rg = rg;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public void setSexo(String sexoBiologico) {
//        this.sexoBiologico = sexoBiologico;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }
//
//    public void setRemedios(String remedios) {
//        this.remedios = remedios;
//    }
//
//    public void setHorario(Agendamento horario) {
//        this.horarios.add(horario);
//    }
//
//    //GETTER
//    public String getCidade() {
//        return cidade;
//    }
//
//    public String getSobrenome() {
//        return sobrenome;
//    }
//
//    public String getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public String getSexo() {
//        return sexoBiologico;
//    }
//
//    public String getRg() {
//        return rg;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public String getRemedios() {
//        return remedios;
//    }
//
//    public ArrayList<Agendamento> getHorario() {
//        return horarios;
//    }
//}
