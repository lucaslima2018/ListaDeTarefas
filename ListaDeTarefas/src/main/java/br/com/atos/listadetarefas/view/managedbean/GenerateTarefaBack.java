package br.com.atos.listadetarefas.view.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.atos.listadetarefas.core.entity.TarefaEntity;

@ManagedBean(name = "gerenciarTarefa")
@SessionScoped
public class GenerateTarefaBack {
	
	private TarefaEntity tarefa;
	
	private Long cont = 0L;
	
	private List<TarefaEntity> tarefas;
	
	public GenerateTarefaBack() {
		tarefa = new TarefaEntity();
		tarefas = new ArrayList<TarefaEntity>();
	}
	
	public void excluir(TarefaEntity tarefa) {
		tarefas.remove(tarefa);
	}
	
	public void salvar() {
		tarefa.setCodigo(cont);
		cont++;
		
		tarefas.add(tarefa);
		
		tarefa = new TarefaEntity();
	}

	public TarefaEntity getTarefa() {
		return tarefa;
	}

	public void setTarefa(TarefaEntity tarefa) {
		this.tarefa = tarefa;
	}

	public List<TarefaEntity> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<TarefaEntity> tarefas) {
		this.tarefas = tarefas;
	}
	
	

}
