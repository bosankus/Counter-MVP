package com.bosankus.countermvp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bosankus.countermvp.contract.ContractInterface
import com.bosankus.countermvp.databinding.ActivityMainBinding
import com.bosankus.countermvp.presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), ContractInterface.View {

    private var binding: ActivityMainBinding? = null
    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        binding?.apply {
            activityMainTvCounter.text = presenter?.getCounter()
            activityMainBtnPlus.setOnClickListener { presenter?.incrementValue() }
            activityMainBtnMinus.setOnClickListener { presenter?.decrementValue() }
        }
    }

    override fun updateViewData() {
        binding?.activityMainTvCounter?.text = presenter?.getCounter()
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}