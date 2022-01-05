package com.bosankus.countermvp.model

import com.bosankus.countermvp.contract.ContractInterface

class MainActivityModel : ContractInterface.Model{

    private var mCounter = 0

    override fun incrementCounter() {
        mCounter++
    }

    override fun decrementCounter() {
        mCounter--
    }

    override fun getCounter(): Int {
        return mCounter
    }
}