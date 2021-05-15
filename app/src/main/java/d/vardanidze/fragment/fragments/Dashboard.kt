package d.vardanidze.fragment.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import d.vardanidze.fragment.R

class Dashboard : Fragment(R.layout.fragment_dashboard) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            DashboardArgs.fromBundle(requireArguments()).amount.toString()
    }
}