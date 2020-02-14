package com.uninorte.hojadevida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.uninorte.hojadevida.model.UserPersonalModel

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController
    lateinit var perfil: UserPersonalModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_fernando).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_andres).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_luis).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
       when(v!!.id){

           R.id.btn_fernando -> {
               perfil = UserPersonalModel("Fernando Visbal",22,"Estudiando", R.mipmap.honoree_avatar)
               val bundle = bundleOf("data" to perfil, "perfil" to perfil)
               navController.navigate(R.id.CVFragment,bundle)
           }

           R.id.btn_andres -> {
               perfil = UserPersonalModel("Andrés Morales",21,"Trabajando", R.mipmap.honoree_avatar)
               val bundle = bundleOf("data" to perfil, "perfil" to perfil)
               navController.navigate(R.id.CVFragment,bundle)
           }

           R.id.btn_luis -> {
               perfil = UserPersonalModel("Luis Sepulveda",20,"Estudiando", R.mipmap.honoree_avatar)
               val bundle = bundleOf("data" to perfil, "perfil" to perfil)
               navController.navigate(R.id.CVFragment,bundle)
           }

       }
    }
}
