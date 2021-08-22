package com.sudoku

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class SolverFragment : Fragment(), View.OnClickListener {

    private var selectedButton: Button? = null
    private var userInputBoard = Array(9) { IntArray(9) { 0 } }
    private var buttonMap = HashMap<String, Button>()
    private var reverseMap = HashMap<Button, String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_solver, container, false)

        Log.i("Solver", "in solver fragment")
        val b11: Button = view.findViewById(R.id.b11)
        val b12: Button = view.findViewById(R.id.b12)
        val b13: Button = view.findViewById(R.id.b13)
        val b14: Button = view.findViewById(R.id.b14)
        val b15: Button = view.findViewById(R.id.b15)
        val b16: Button = view.findViewById(R.id.b16)
        val b17: Button = view.findViewById(R.id.b17)
        val b18: Button = view.findViewById(R.id.b18)
        val b19: Button = view.findViewById(R.id.b19)
        val b21: Button = view.findViewById(R.id.b21)
        val b22: Button = view.findViewById(R.id.b22)
        val b23: Button = view.findViewById(R.id.b23)
        val b24: Button = view.findViewById(R.id.b24)
        val b25: Button = view.findViewById(R.id.b25)
        val b26: Button = view.findViewById(R.id.b26)
        val b27: Button = view.findViewById(R.id.b27)
        val b28: Button = view.findViewById(R.id.b28)
        val b29: Button = view.findViewById(R.id.b29)
        val b31: Button = view.findViewById(R.id.b31)
        val b32: Button = view.findViewById(R.id.b32)
        val b33: Button = view.findViewById(R.id.b33)
        val b34: Button = view.findViewById(R.id.b34)
        val b35: Button = view.findViewById(R.id.b35)
        val b36: Button = view.findViewById(R.id.b36)
        val b37: Button = view.findViewById(R.id.b37)
        val b38: Button = view.findViewById(R.id.b38)
        val b39: Button = view.findViewById(R.id.b39)
        val b41: Button = view.findViewById(R.id.b41)
        val b42: Button = view.findViewById(R.id.b42)
        val b43: Button = view.findViewById(R.id.b43)
        val b44: Button = view.findViewById(R.id.b44)
        val b45: Button = view.findViewById(R.id.b45)
        val b46: Button = view.findViewById(R.id.b46)
        val b47: Button = view.findViewById(R.id.b47)
        val b48: Button = view.findViewById(R.id.b48)
        val b49: Button = view.findViewById(R.id.b49)
        val b51: Button = view.findViewById(R.id.b51)
        val b52: Button = view.findViewById(R.id.b52)
        val b53: Button = view.findViewById(R.id.b53)
        val b54: Button = view.findViewById(R.id.b54)
        val b55: Button = view.findViewById(R.id.b55)
        val b56: Button = view.findViewById(R.id.b56)
        val b57: Button = view.findViewById(R.id.b57)
        val b58: Button = view.findViewById(R.id.b58)
        val b59: Button = view.findViewById(R.id.b59)
        val b61: Button = view.findViewById(R.id.b61)
        val b62: Button = view.findViewById(R.id.b62)
        val b63: Button = view.findViewById(R.id.b63)
        val b64: Button = view.findViewById(R.id.b64)
        val b65: Button = view.findViewById(R.id.b65)
        val b66: Button = view.findViewById(R.id.b66)
        val b67: Button = view.findViewById(R.id.b67)
        val b68: Button = view.findViewById(R.id.b68)
        val b69: Button = view.findViewById(R.id.b69)
        val b71: Button = view.findViewById(R.id.b71)
        val b72: Button = view.findViewById(R.id.b72)
        val b73: Button = view.findViewById(R.id.b73)
        val b74: Button = view.findViewById(R.id.b74)
        val b75: Button = view.findViewById(R.id.b75)
        val b76: Button = view.findViewById(R.id.b76)
        val b77: Button = view.findViewById(R.id.b77)
        val b78: Button = view.findViewById(R.id.b78)
        val b79: Button = view.findViewById(R.id.b79)
        val b81: Button = view.findViewById(R.id.b81)
        val b82: Button = view.findViewById(R.id.b82)
        val b83: Button = view.findViewById(R.id.b83)
        val b84: Button = view.findViewById(R.id.b84)
        val b85: Button = view.findViewById(R.id.b85)
        val b86: Button = view.findViewById(R.id.b86)
        val b87: Button = view.findViewById(R.id.b87)
        val b88: Button = view.findViewById(R.id.b88)
        val b89: Button = view.findViewById(R.id.b89)
        val b91: Button = view.findViewById(R.id.b91)
        val b92: Button = view.findViewById(R.id.b92)
        val b93: Button = view.findViewById(R.id.b93)
        val b94: Button = view.findViewById(R.id.b94)
        val b95: Button = view.findViewById(R.id.b95)
        val b96: Button = view.findViewById(R.id.b96)
        val b97: Button = view.findViewById(R.id.b97)
        val b98: Button = view.findViewById(R.id.b98)
        val b99: Button = view.findViewById(R.id.b99)

        buttonMap["b11"] = b11
        buttonMap["b12"] = b12
        buttonMap["b13"] = b13
        buttonMap["b14"] = b14
        buttonMap["b15"] = b15
        buttonMap["b16"] = b16
        buttonMap["b17"] = b17
        buttonMap["b18"] = b18
        buttonMap["b19"] = b19
        buttonMap["b21"] = b21
        buttonMap["b22"] = b22
        buttonMap["b23"] = b23
        buttonMap["b24"] = b24
        buttonMap["b25"] = b25
        buttonMap["b26"] = b26
        buttonMap["b27"] = b27
        buttonMap["b28"] = b28
        buttonMap["b29"] = b29
        buttonMap["b31"] = b31
        buttonMap["b32"] = b32
        buttonMap["b33"] = b33
        buttonMap["b34"] = b34
        buttonMap["b35"] = b35
        buttonMap["b36"] = b36
        buttonMap["b37"] = b37
        buttonMap["b38"] = b38
        buttonMap["b39"] = b39
        buttonMap["b41"] = b41
        buttonMap["b42"] = b42
        buttonMap["b43"] = b43
        buttonMap["b44"] = b44
        buttonMap["b45"] = b45
        buttonMap["b46"] = b46
        buttonMap["b47"] = b47
        buttonMap["b48"] = b48
        buttonMap["b49"] = b49
        buttonMap["b51"] = b51
        buttonMap["b52"] = b52
        buttonMap["b53"] = b53
        buttonMap["b54"] = b54
        buttonMap["b55"] = b55
        buttonMap["b56"] = b56
        buttonMap["b57"] = b57
        buttonMap["b58"] = b58
        buttonMap["b59"] = b59
        buttonMap["b61"] = b61
        buttonMap["b62"] = b62
        buttonMap["b63"] = b63
        buttonMap["b64"] = b64
        buttonMap["b65"] = b65
        buttonMap["b66"] = b66
        buttonMap["b67"] = b67
        buttonMap["b68"] = b68
        buttonMap["b69"] = b69
        buttonMap["b71"] = b71
        buttonMap["b72"] = b72
        buttonMap["b73"] = b73
        buttonMap["b74"] = b74
        buttonMap["b75"] = b75
        buttonMap["b76"] = b76
        buttonMap["b77"] = b77
        buttonMap["b78"] = b78
        buttonMap["b79"] = b79
        buttonMap["b81"] = b81
        buttonMap["b82"] = b82
        buttonMap["b83"] = b83
        buttonMap["b84"] = b84
        buttonMap["b85"] = b85
        buttonMap["b86"] = b86
        buttonMap["b87"] = b87
        buttonMap["b88"] = b88
        buttonMap["b89"] = b89
        buttonMap["b91"] = b91
        buttonMap["b92"] = b92
        buttonMap["b93"] = b93
        buttonMap["b94"] = b94
        buttonMap["b95"] = b95
        buttonMap["b96"] = b96
        buttonMap["b97"] = b97
        buttonMap["b98"] = b98
        buttonMap["b99"] = b99

        reverseMap[b11] = "b11"
        reverseMap[b12] = "b12"
        reverseMap[b13] = "b13"
        reverseMap[b14] = "b14"
        reverseMap[b15] = "b15"
        reverseMap[b16] = "b16"
        reverseMap[b17] = "b17"
        reverseMap[b18] = "b18"
        reverseMap[b19] = "b19"
        reverseMap[b21] = "b21"
        reverseMap[b22] = "b22"
        reverseMap[b23] = "b23"
        reverseMap[b24] = "b24"
        reverseMap[b25] = "b25"
        reverseMap[b26] = "b26"
        reverseMap[b27] = "b27"
        reverseMap[b28] = "b28"
        reverseMap[b29] = "b29"
        reverseMap[b31] = "b31"
        reverseMap[b32] = "b32"
        reverseMap[b33] = "b33"
        reverseMap[b34] = "b34"
        reverseMap[b35] = "b35"
        reverseMap[b36] = "b36"
        reverseMap[b37] = "b37"
        reverseMap[b38] = "b38"
        reverseMap[b39] = "b39"
        reverseMap[b41] = "b41"
        reverseMap[b42] = "b42"
        reverseMap[b43] = "b43"
        reverseMap[b44] = "b44"
        reverseMap[b45] = "b45"
        reverseMap[b46] = "b46"
        reverseMap[b47] = "b47"
        reverseMap[b48] = "b48"
        reverseMap[b49] = "b49"
        reverseMap[b51] = "b51"
        reverseMap[b52] = "b52"
        reverseMap[b53] = "b53"
        reverseMap[b54] = "b54"
        reverseMap[b55] = "b55"
        reverseMap[b56] = "b56"
        reverseMap[b57] = "b57"
        reverseMap[b58] = "b58"
        reverseMap[b59] = "b59"
        reverseMap[b61] = "b61"
        reverseMap[b62] = "b62"
        reverseMap[b63] = "b63"
        reverseMap[b64] = "b64"
        reverseMap[b65] = "b65"
        reverseMap[b66] = "b66"
        reverseMap[b67] = "b67"
        reverseMap[b68] = "b68"
        reverseMap[b69] = "b69"
        reverseMap[b71] = "b71"
        reverseMap[b72] = "b72"
        reverseMap[b73] = "b73"
        reverseMap[b74] = "b74"
        reverseMap[b75] = "b75"
        reverseMap[b76] = "b76"
        reverseMap[b77] = "b77"
        reverseMap[b78] = "b78"
        reverseMap[b79] = "b79"
        reverseMap[b81] = "b81"
        reverseMap[b82] = "b82"
        reverseMap[b83] = "b83"
        reverseMap[b84] = "b84"
        reverseMap[b85] = "b85"
        reverseMap[b86] = "b86"
        reverseMap[b87] = "b87"
        reverseMap[b88] = "b88"
        reverseMap[b89] = "b89"
        reverseMap[b91] = "b91"
        reverseMap[b92] = "b92"
        reverseMap[b93] = "b93"
        reverseMap[b94] = "b94"
        reverseMap[b95] = "b95"
        reverseMap[b96] = "b96"
        reverseMap[b97] = "b97"
        reverseMap[b98] = "b98"
        reverseMap[b99] = "b99"

        b11.setOnClickListener(this)
        b12.setOnClickListener(this)
        b13.setOnClickListener(this)
        b14.setOnClickListener(this)
        b15.setOnClickListener(this)
        b16.setOnClickListener(this)
        b17.setOnClickListener(this)
        b18.setOnClickListener(this)
        b19.setOnClickListener(this)
        b21.setOnClickListener(this)
        b22.setOnClickListener(this)
        b23.setOnClickListener(this)
        b24.setOnClickListener(this)
        b25.setOnClickListener(this)
        b26.setOnClickListener(this)
        b27.setOnClickListener(this)
        b28.setOnClickListener(this)
        b29.setOnClickListener(this)
        b31.setOnClickListener(this)
        b32.setOnClickListener(this)
        b33.setOnClickListener(this)
        b34.setOnClickListener(this)
        b35.setOnClickListener(this)
        b36.setOnClickListener(this)
        b37.setOnClickListener(this)
        b38.setOnClickListener(this)
        b39.setOnClickListener(this)
        b41.setOnClickListener(this)
        b42.setOnClickListener(this)
        b43.setOnClickListener(this)
        b44.setOnClickListener(this)
        b45.setOnClickListener(this)
        b46.setOnClickListener(this)
        b47.setOnClickListener(this)
        b48.setOnClickListener(this)
        b49.setOnClickListener(this)
        b51.setOnClickListener(this)
        b52.setOnClickListener(this)
        b53.setOnClickListener(this)
        b54.setOnClickListener(this)
        b55.setOnClickListener(this)
        b56.setOnClickListener(this)
        b57.setOnClickListener(this)
        b58.setOnClickListener(this)
        b59.setOnClickListener(this)
        b61.setOnClickListener(this)
        b62.setOnClickListener(this)
        b63.setOnClickListener(this)
        b64.setOnClickListener(this)
        b65.setOnClickListener(this)
        b66.setOnClickListener(this)
        b67.setOnClickListener(this)
        b68.setOnClickListener(this)
        b69.setOnClickListener(this)
        b71.setOnClickListener(this)
        b72.setOnClickListener(this)
        b73.setOnClickListener(this)
        b74.setOnClickListener(this)
        b75.setOnClickListener(this)
        b76.setOnClickListener(this)
        b77.setOnClickListener(this)
        b78.setOnClickListener(this)
        b79.setOnClickListener(this)
        b81.setOnClickListener(this)
        b82.setOnClickListener(this)
        b83.setOnClickListener(this)
        b84.setOnClickListener(this)
        b85.setOnClickListener(this)
        b86.setOnClickListener(this)
        b87.setOnClickListener(this)
        b88.setOnClickListener(this)
        b89.setOnClickListener(this)
        b91.setOnClickListener(this)
        b92.setOnClickListener(this)
        b93.setOnClickListener(this)
        b94.setOnClickListener(this)
        b95.setOnClickListener(this)
        b96.setOnClickListener(this)
        b97.setOnClickListener(this)
        b98.setOnClickListener(this)
        b99.setOnClickListener(this)

        val clr: Button = view.findViewById(R.id.clear)
        val one: Button = view.findViewById(R.id.one)
        val two: Button = view.findViewById(R.id.two)
        val three: Button = view.findViewById(R.id.three)
        val four: Button = view.findViewById(R.id.four)
        val five: Button = view.findViewById(R.id.five)
        val six: Button = view.findViewById(R.id.six)
        val seven: Button = view.findViewById(R.id.seven)
        val eight: Button = view.findViewById(R.id.eight)
        val nine: Button = view.findViewById(R.id.nine)

        clr.setOnClickListener(this)
        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)
        four.setOnClickListener(this)
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
        nine.setOnClickListener(this)

        val solve: Button = view.findViewById(R.id.solveButton)
        val reset: Button = view.findViewById(R.id.resetButton)

        reset.setOnClickListener(this)
        solve.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.clear -> {
                selectedButton?.text = ""
                selectedButton!!.setTextColor(Color.parseColor("#000000"))
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 0
                }
                return
            }
            R.id.one -> {
                selectedButton?.text = "1"
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 1
                }
                return
            }
            R.id.two -> {
                selectedButton?.text = "2"
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 2
                }
                return
            }
            R.id.three -> {
                selectedButton?.text = "3"
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 3
                }
                return
            }
            R.id.four -> {
                selectedButton?.text = "4"
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 4
                }
                return
            }
            R.id.five -> {
                selectedButton?.text = "5"
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 5
                }
                return
            }
            R.id.six -> {
                selectedButton?.text = "6"
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 6
                }
                return
            }
            R.id.seven -> {
                selectedButton?.text = "7"
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 7
                }
                return
            }
            R.id.eight -> {
                selectedButton?.text = "8"
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 8
                }
                return
            }
            R.id.nine -> {
                selectedButton?.text = "9"
                val row = reverseMap[selectedButton]?.get(1)?.toString()?.toInt()
                val col = reverseMap[selectedButton]?.get(2)?.toString()?.toInt()
                if (col != null && row != null) {
                    userInputBoard[row - 1][col - 1] = 9
                }
                return
            }
            R.id.solveButton -> {
                if (selectedButton != null) {
                    if (selectedButton?.text?.isEmpty()!!) {
                        removeHighlight(selectedButton!!)
                        selectedButton!!.setTextColor(Color.parseColor("#000000"))
                        selectedButton!!.setBackgroundResource(R.drawable.button_border)
                    } else {
                        removeHighlight(selectedButton!!)
                        selectedButton!!.setBackgroundResource(R.drawable.selected_button_border)
                    }
                }
                Log.i("solver", "solve button clicked")
                if (solve()) {
                    showResult()
                } else {
                    Toast.makeText(
                        activity,
                        "Please check your entries. No possible solution exists for this input.",
                        Toast.LENGTH_SHORT
                    ).show()
                    Log.i("solver", "reached else block safely")
                }
                return
            }
            R.id.resetButton -> {
                resetBoard()
                return
            }
        }
        if (selectedButton != null) {
            if (selectedButton!!.text.toString().isEmpty()) {
                selectedButton!!.setTextColor(Color.parseColor("#000000"))
                selectedButton!!.setBackgroundResource(R.drawable.button_border)
                removeHighlight(selectedButton!!)
            }
        }
        if (selectedButton != null) removeHighlight(selectedButton!!)
        selectedButton = v as Button
        highlight(selectedButton!!)
        selectedButton!!.setBackgroundResource(R.drawable.selected_button_border)
        selectedButton!!.setTextColor(Color.parseColor("#ffffff"))

    }

    private fun removeHighlight(button: Button) {

        if (selectedButton == null) return

        val row = reverseMap[button]?.get(1)?.toString()?.toInt()
        val col = reverseMap[button]?.get(2)?.toString()?.toInt()

        for (i in 0 until 9) {
            if (row != null) {
                if (userInputBoard[row - 1][i] == 0) {
                    buttonMap["b${row}${i + 1}"]?.setBackgroundResource(R.drawable.button_border)
                }
            }
        }
        for (i in 0 until 9) {
            if (col != null) {
                if (userInputBoard[i][col - 1] == 0) {
                    buttonMap["b${i + 1}${col}"]?.setBackgroundResource(R.drawable.button_border)
                }
            }
        }
    }

    private fun highlight(button: Button) {

        val row = reverseMap[button]?.get(1)?.toString()?.toInt()
        val col = reverseMap[button]?.get(2)?.toString()?.toInt()

        for (i in 0 until 9) {
            if (row != null) {
                if (userInputBoard[row - 1][i] == 0) {
                    buttonMap["b${row}${i + 1}"]?.setBackgroundResource(R.drawable.highlighted_button)
                }
            }
        }
        for (i in 0 until 9) {
            if (col != null) {
                if (userInputBoard[i][col - 1] == 0) {
                    buttonMap["b${i + 1}${col}"]?.setBackgroundResource(R.drawable.highlighted_button)
                }
            }
        }
    }

    private fun resetBoard() {
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                userInputBoard[i][j] = 0
                buttonMap["b${i + 1}${j + 1}"]?.text = ""
                buttonMap["b${i + 1}${j + 1}"]?.setTextColor(Color.parseColor("#000000"))
                buttonMap["b${i + 1}${j + 1}"]?.setBackgroundResource(R.drawable.button_border)
            }
        }
    }

    private fun showResult() {

        var buttonId = "b00"
        for (i in 0 until 9) {
            buttonId = "b" + (i + 1).toString() + buttonId[2].toString()
            for (j in 0 until 9) {
                buttonId = buttonId.substring(0, 2) + (j + 1).toString()
                buttonMap[buttonId]?.text = userInputBoard[i][j].toString()
            }
        }
    }

    // Code to Solve Sudoku Present here

    private fun isSafe(row: Int, col: Int, num: Int): Boolean {

        for (d in 0 until 9) {
            if (d == col)
                continue
            if (userInputBoard[row][d] == num) {
                return false
            }
        }
        for (r in 0 until 9) {
            if (r == row)
                continue
            if (userInputBoard[r][col] == num) {
                return false
            }
        }

        val sqrt = 3
        val boxRowStart = row - row % sqrt
        val boxColStart = col - col % sqrt

        for (r in boxRowStart until (boxRowStart + sqrt)) {
            for (d in boxColStart until (boxColStart + sqrt)) {
                if (d == col && r == row)
                    continue
                if (userInputBoard[r][d] == num) {
                    return false
                }
            }
        }
        return true
    }

    private fun solveSudoku(N: Int): Boolean {
        var row = -1
        var col = -1
        var isEmpty = true
        for (i in 0 until N) {
            for (j in 0 until N) {
                if (userInputBoard[i][j] == 0) {
                    row = i
                    col = j
                    isEmpty = false
                    break
                }
            }
            if (!isEmpty) {
                break
            }
        }
        if (isEmpty) {
            return true
        }
        for (num in 1 until N + 1) {
            if (isSafe(row, col, num)) {
                userInputBoard[row][col] = num
                if (solveSudoku(N)) {
                    return true
                } else {
                    userInputBoard[row][col] = 0
                }
            }
        }
        return false
    }

    private fun solve(): Boolean {
        for (row in 0..8) {
            for (col in 0..8) {
                if (userInputBoard[row][col] != 0) {
                    if (!isSafe(row, col, userInputBoard[row][col]))
                        return false
                }
            }
        }
        val N = 9
        return solveSudoku(N)
    }
}
