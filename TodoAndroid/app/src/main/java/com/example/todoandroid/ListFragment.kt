package com.example.todoandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoandroid.adapter.TarefaAdapter
import com.example.todoandroid.databinding.FragmentListBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var  binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)


        val listTarefas = listOf(
            Tarefa(
                "Lavar a louça",
                "Lavar a louça o dia todo",
                "Enzo",
                "2022-09-26",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Lavar o carro",
                "Lavar o carro",
                "Enzo",
                "2022-09-26",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Fazer o almoço",
                "preparar a comida do 12h",
                "Enzo",
                "2022-09-26",
                false,
                "Dia a Dia"
            ),

        )
        //Configuração do RecyclerView
        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }


}