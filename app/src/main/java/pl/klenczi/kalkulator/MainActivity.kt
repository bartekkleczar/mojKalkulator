package pl.klenczi.kalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.klenczi.kalkulator.databinding.ActivityMainBinding
import kotlin.math.pow
import android.content.res.Configuration
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var caloksztalt1: String = ""
    private var caloksztalt2: String = ""
    private var dzialanie: String = ""
    private var suma = 0.0
    private var save = false
    private var procent = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun drugie() {
            binding.myButtonJeden.setOnClickListener {
                var data = binding.myButtonJeden.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonDwa.setOnClickListener {
                var data = binding.myButtonDwa.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonTrzy.setOnClickListener {
                var data = binding.myButtonTrzy.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonCztery.setOnClickListener {
                var data = binding.myButtonCztery.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonPiec.setOnClickListener {
                var data = binding.myButtonPiec.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonSzesc.setOnClickListener {
                var data = binding.myButtonSzesc.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonSiedem.setOnClickListener {
                var data = binding.myButtonSiedem.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonOsiem.setOnClickListener {
                var data = binding.myButtonOsiem.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonDziewiec.setOnClickListener {
                var data = binding.myButtonDziewiec.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonZero.setOnClickListener {
                var data = binding.myButtonZero.text
                caloksztalt2 += data
                binding.myEditText.text = caloksztalt2.toString()
            }

            binding.myButtonSave.setOnClickListener{
                save = true
                if(save == true){
                    if(suma != 0.0) {binding.myButtonPaste.setOnClickListener{
                        caloksztalt2 = suma.toString(); binding.mySkladnia.text = caloksztalt2
                    }}
                    else{
                        if(save == false){suma = 0.0}
                        else if(save == true){caloksztalt1 = suma.toString() }}}
                else{suma = 0.0}
                save = false
            }

            binding.myButtonBackSpace.setOnClickListener {
                var data = caloksztalt2.substring(0, caloksztalt2.length - 1)
                caloksztalt2 = data
                binding.myEditText.text = caloksztalt2

            }

            binding.mySkladnia.text = caloksztalt1 + " " + dzialanie

            binding.myButtonRowna.setOnClickListener {
                if(caloksztalt1 == ""){caloksztalt1 = "0"}
                if(caloksztalt2 == ""){caloksztalt2 = "0"}
                if (dzialanie != ""){binding.mySkladnia.text = ""}
                if (dzialanie == "+") {
                    suma = caloksztalt1.toDouble() + caloksztalt2.toDouble()
                    suma =String.format("%.2f", suma).toDouble()
                }
                if (dzialanie == "-") {
                    suma = caloksztalt1.toDouble() - caloksztalt2.toDouble()
                    suma =String.format("%.2f", suma).toDouble()
                }
                if (dzialanie == "*") {
                    suma = caloksztalt1.toDouble() * caloksztalt2.toDouble()
                    suma =String.format("%.2f", suma).toDouble()
                }
                if (dzialanie == "/") {
                    suma = caloksztalt1.toDouble() / caloksztalt2.toDouble()
                    suma =String.format("%.2f", suma).toDouble()
                }
                if (dzialanie == "%") {
                    procent = caloksztalt1
                    caloksztalt1 = (caloksztalt1.toDouble() / 100.0).toString()
                    suma = caloksztalt1.toDouble() * caloksztalt2.toDouble()
                    suma = String.format("%.2f", suma).toDouble()
                }
                if (dzialanie == "Log") {
                    suma = caloksztalt1.toDouble().pow(caloksztalt2.toDouble())
                    suma = String.format("%.2f", suma).toDouble()
                }
                if (dzialanie == "^") {
                    suma = caloksztalt1.toDouble().pow(caloksztalt2.toDouble())
                    suma = String.format("%.2f", suma).toDouble()
                }

                if(dzialanie == "Log"){binding.myEditText.text =  dzialanie + "'" + caloksztalt1 + "($suma)" + " = " + caloksztalt2}
                else if(dzialanie == "%"){binding.myEditText.text =  procent + " $dzialanie " + caloksztalt2 + " = " + suma}
                else{binding.myEditText.text = caloksztalt1 + " $dzialanie " + caloksztalt2 + " = " + suma}

                val lang = "pl"
                val locale = Locale(lang)
                Locale.setDefault(locale)

                val config = baseContext.resources.configuration
                config.setLocale(locale)
                baseContext.createConfigurationContext(config)
            }

        }

        fun pierwsze() {

            val lang = "US"
            val locale = Locale(lang)
            Locale.setDefault(locale)

            val config = baseContext.resources.configuration
            config.setLocale(locale)
            baseContext.createConfigurationContext(config)

            binding.myButtonJeden.setOnClickListener {
                var data = binding.myButtonJeden.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1.toString()
            }

            binding.myButtonDwa.setOnClickListener {
                var data = binding.myButtonDwa.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1.toString()
            }

            binding.myButtonTrzy.setOnClickListener {
                var data = binding.myButtonTrzy.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1.toString()
            }

            binding.myButtonCztery.setOnClickListener {
                var data = binding.myButtonCztery.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1.toString()
            }

            binding.myButtonPiec.setOnClickListener {
                var data = binding.myButtonPiec.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1.toString()
            }

            binding.myButtonSzesc.setOnClickListener {
                var data = binding.myButtonSzesc.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1.toString()
            }

            binding.myButtonSiedem.setOnClickListener {
                var data = binding.myButtonSiedem.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1.toString()
            }

            binding.myButtonOsiem.setOnClickListener {
                var data = binding.myButtonOsiem.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1.toString()
            }

            binding.myButtonDziewiec.setOnClickListener {
                var data = binding.myButtonDziewiec.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1.toString()
            }

            binding.myButtonZero.setOnClickListener {
                var data = binding.myButtonZero.text
                caloksztalt1 += data
                binding.myEditText.text = caloksztalt1
            }

            binding.myButtonBackSpace.setOnClickListener {
                var data = caloksztalt1.substring(0, caloksztalt1.length - 1)
                caloksztalt1 = data
                binding.myEditText.text = caloksztalt1
            }


            binding.myButtonPlus.setOnClickListener {
                dzialanie = "+"
                binding.myEditText.text = " "
                drugie()
            }

            binding.myButtonMinus.setOnClickListener {
                dzialanie = "-"
                binding.myEditText.text = " "
                drugie()
            }

            binding.myButtonMnozenie.setOnClickListener {
                dzialanie = "*"
                binding.myEditText.text = " "
                drugie()
            }

            binding.myButtonDzielenie.setOnClickListener {
                dzialanie = "/"
                binding.myEditText.text = " "
                drugie()
            }

            binding.myButtonProcent.setOnClickListener {
                dzialanie = "%"
                binding.myEditText.text = " "
                drugie()
            }

            binding.myButtonLog.setOnClickListener {
                dzialanie = "Log"
                binding.myEditText.text = " "
                drugie()
            }

            binding.myButtonPotega.setOnClickListener {
                dzialanie = "^"
                binding.myEditText.text = " "
                drugie()
            }

        }

        binding.myButtonReset.setOnClickListener {
            binding.myEditText.text = ""
            caloksztalt1 = ""
            caloksztalt2 = ""

            pierwsze()
        }

        pierwsze()
    }
}