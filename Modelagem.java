public class Modelagem extends UnidadeCurricular {

    @Override
public void exibirCargahoraria() {
    setCargaHoraria(280);// Sobrescreve a carga horária para 280 horas
    System.out.println("Unidade Curricular: " + getNome());
    System.out.println("Dia: " + getDia());
    System.out.println("Horário: " + getHorario());
    System.out.println("Sala: " + getSala());
    System.out.println("Carga Horária: " + getCargaHoraria() + " horas");
    
}
}