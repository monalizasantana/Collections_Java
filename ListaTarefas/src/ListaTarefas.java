import java.util.ArrayList;
import java.util.List;

public class ListaTarefas{

    private List<Tarefa> tarefaList;


    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));

    }

    public void removerTerefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDecricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }

        tarefasParaRemover.removeAll(tarefasParaRemover);

    }


    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa( "Tarefa 1");
        listaTarefas.adicionarTarefa( "Tarefa 1");
        listaTarefas.adicionarTarefa( "Tarefa 2");

        listaTarefas.removerTerefa( "Tarefa 1");        
        listaTarefas.obterDescricaoTarefa();
    }
}