package com.bosankus.countermvp.contract

interface ContractInterface {

    interface View {
        fun initView()
        fun updateViewData()
    }

    interface Presenter {
        fun incrementValue()
        fun decrementValue()
        fun getCounter(): String
    }

    interface Model {
        fun incrementCounter()
        fun decrementCounter()
        fun getCounter(): Int
    }
}