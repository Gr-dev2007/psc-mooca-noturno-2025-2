public class UnidadeCurricular {

    private String nome;
    private String dia;
    private String horario;
    private String sala;
    private int cargaHoraria = 360; // Carga horária padrão de 360 horas

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }


public void exibirCargahoraria() {
    System.out.println("Unidade Curricular: " + nome);
    System.out.println("Dia: " + dia);
    System.out.println("Horário: " + horario);
    System.out.println("Sala: " + sala);
    System.out.println("Carga Horária: " + cargaHoraria + " horas");

    
}
public int getCargaHoraria() {
    return cargaHoraria;
}
public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
}
}
