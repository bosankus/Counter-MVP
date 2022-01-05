package com.bosankus.countermvp.presenter

import com.bosankus.countermvp.contract.ContractInterface
import com.bosankus.countermvp.model.MainActivityModel

class MainActivityPresenter(_view: ContractInterface.View): ContractInterface.Presenter {

    private var view: ContractInterface.View = _view
    private var model: ContractInterface.Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun decrementValue() {
        model.decrementCounter()
        view.updateViewData()
    }

    override fun getCounter(): String {
        return model.getCounter().toString()
    }
}