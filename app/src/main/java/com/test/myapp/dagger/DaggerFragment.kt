package com.test.myapp.dagger

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.test.myapp.R
import com.test.myapp.base.MyApplication
import javax.inject.Inject

private const val TAG = "dagger"

class DaggerFragment : Fragment() {

    lateinit var repoGraph: RepoGraph

    @Inject
    lateinit var userRepository: UserRepository


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (activity != null) {
            repoGraph = (activity?.applicationContext as MyApplication).appComponent.repoSubcomponent().create()
            repoGraph.inject(this)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dagger, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userRepository.log()
    }

    companion object {
        @JvmStatic
        fun newInstance() = DaggerFragment()
    }
}