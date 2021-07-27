package me.aydie.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import me.aydie.calculator.databinding.CalculatorFragmentBinding
import me.aydie.calculator.viewmodels.CalculatorViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class CalculatorFragment : Fragment() {

    private var _binding: CalculatorFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var calculatorViewModel : CalculatorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)
        _binding = CalculatorFragmentBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = this@CalculatorFragment
            calculatorModel = calculatorViewModel
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}