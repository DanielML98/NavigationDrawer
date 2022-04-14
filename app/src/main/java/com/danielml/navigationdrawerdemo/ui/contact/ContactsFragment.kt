package com.danielml.navigationdrawerdemo.ui.contact

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.danielml.navigationdrawerdemo.R
import com.danielml.navigationdrawerdemo.databinding.FragmentContactsBinding
import com.danielml.navigationdrawerdemo.databinding.FragmentHomeBinding
import com.danielml.navigationdrawerdemo.ui.home.HomeViewModel

class ContactsFragment : Fragment() {


  private var _binding: FragmentContactsBinding? = null

  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    _binding = FragmentContactsBinding.inflate(inflater, container, false)
    val root: View = binding.root

    return root
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}