package com.example.linkybproject.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linkybproject.MainActivity
import com.example.linkybproject.R
import com.example.linkybproject.databinding.ActivitySignup4Binding

class SignupActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivitySignup4Binding

    // api 통신
    private lateinit var userProfileInfo : String
    private lateinit var userSex : String
    private lateinit var userMBTI : String
    private lateinit var userPersonality : String
    private lateinit var userInterest : String
    private lateinit var userSelfIntroduction : String

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignup4Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // back 버튼
        binding.imageViewSignup4Back.setOnClickListener {
            finish()
        }

        // 버튼 비활성화 및 뷰 안 보이게 설정
        binding.textViewBtnNext5Grey.isEnabled = false
        // 프로필
        binding.imageViewSignup4Profile1Green.visibility = View.INVISIBLE
        binding.imageViewSignup4Profile2Green.visibility = View.INVISIBLE
        binding.imageViewSignup4Profile3Green.visibility = View.INVISIBLE
        binding.imageViewSignup4Profile4Green.visibility = View.INVISIBLE
        // 성별
        binding.textViewBtnFemaleGreen.visibility = View.INVISIBLE
        binding.textViewBtnMaleGreen.visibility = View.INVISIBLE

        // 1. 프로필
        binding.imageViewSignup4Profile1.setOnClickListener {
            if (binding.imageViewSignup4Profile1Green.visibility == View.INVISIBLE) {
                if (binding.imageViewSignup4Profile2Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile2Grey.visibility = android.view.View.VISIBLE
                } else if (binding.imageViewSignup4Profile3Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile3Grey.visibility = android.view.View.VISIBLE
                } else if (binding.imageViewSignup4Profile4Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile4Grey.visibility = android.view.View.VISIBLE
                }
                binding.imageViewSignup4Profile1Green.visibility = View.VISIBLE
                binding.imageViewSignup4Profile2Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile3Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile4Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile1Grey.visibility = View.INVISIBLE
            } else if (binding.imageViewSignup4Profile1Green.visibility == View.VISIBLE){
                binding.imageViewSignup4Profile1Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile1Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile2Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile3Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile4Grey.visibility = View.VISIBLE
            }
        }
        binding.imageViewSignup4Profile2.setOnClickListener {
            if (binding.imageViewSignup4Profile2Green.visibility == View.INVISIBLE) {
                if (binding.imageViewSignup4Profile1Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile1Grey.visibility = View.VISIBLE
                } else if (binding.imageViewSignup4Profile4Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile4Grey.visibility = android.view.View.VISIBLE
                } else if (binding.imageViewSignup4Profile3Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile3Grey.visibility = android.view.View.VISIBLE
                }
                binding.imageViewSignup4Profile2Green.visibility = View.VISIBLE
                binding.imageViewSignup4Profile1Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile3Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile4Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile2Grey.visibility = View.INVISIBLE
            } else if (binding.imageViewSignup4Profile2Green.visibility == View.VISIBLE){
                binding.imageViewSignup4Profile2Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile2Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile1Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile3Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile4Grey.visibility = View.VISIBLE
            }
        }
        binding.imageViewSignup4Profile3.setOnClickListener {
            if (binding.imageViewSignup4Profile3Green.visibility == View.INVISIBLE) {
                if (binding.imageViewSignup4Profile1Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile1Grey.visibility = View.VISIBLE
                } else if (binding.imageViewSignup4Profile2Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile2Grey.visibility = android.view.View.VISIBLE
                } else if (binding.imageViewSignup4Profile4Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile4Grey.visibility = android.view.View.VISIBLE
                }
                binding.imageViewSignup4Profile3Green.visibility = View.VISIBLE
                binding.imageViewSignup4Profile2Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile1Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile4Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile3Grey.visibility = View.INVISIBLE
            } else if (binding.imageViewSignup4Profile3Green.visibility == View.VISIBLE){
                binding.imageViewSignup4Profile3Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile3Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile2Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile1Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile4Grey.visibility = View.VISIBLE
            }
        }
        binding.imageViewSignup4Profile4.setOnClickListener {
            if (binding.imageViewSignup4Profile4Green.visibility == View.INVISIBLE) {
                if (binding.imageViewSignup4Profile1Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile1Grey.visibility = View.VISIBLE
                } else if (binding.imageViewSignup4Profile2Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile2Grey.visibility = android.view.View.VISIBLE
                } else if (binding.imageViewSignup4Profile3Green.visibility == View.VISIBLE) {
                    binding.imageViewSignup4Profile3Grey.visibility = android.view.View.VISIBLE
                }
                binding.imageViewSignup4Profile4Green.visibility = View.VISIBLE
                binding.imageViewSignup4Profile2Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile3Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile1Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile4Grey.visibility = View.INVISIBLE
            } else if (binding.imageViewSignup4Profile4Green.visibility == View.VISIBLE){
                binding.imageViewSignup4Profile4Green.visibility = View.INVISIBLE
                binding.imageViewSignup4Profile4Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile2Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile3Grey.visibility = View.VISIBLE
                binding.imageViewSignup4Profile1Grey.visibility = View.VISIBLE
            }
        }

        // 2. 성별
        binding.textViewBtnMaleGrey.setOnClickListener {
            if (binding.textViewBtnFemaleGreen.visibility == View.VISIBLE) {
                binding.textViewBtnFemaleGreen.visibility = View.INVISIBLE
                binding.textViewBtnFemaleGrey.visibility = View.VISIBLE
                binding.textViewBtnMaleGrey.visibility = View.INVISIBLE
                binding.textViewBtnMaleGreen.visibility = View.VISIBLE
            } else {
                binding.textViewBtnMaleGrey.visibility = View.INVISIBLE
                binding.textViewBtnMaleGreen.visibility = View.VISIBLE
            }
        }
        binding.textViewBtnMaleGreen.setOnClickListener {
            if (binding.textViewBtnFemaleGreen.visibility == View.INVISIBLE) {
                binding.textViewBtnMaleGrey.visibility = View.VISIBLE
                binding.textViewBtnMaleGreen.visibility = View.INVISIBLE
            } else {
                binding.textViewBtnFemaleGreen.visibility = View.INVISIBLE
                binding.textViewBtnFemaleGrey.visibility = View.VISIBLE
                binding.textViewBtnMaleGreen.visibility = View.VISIBLE
                binding.textViewBtnMaleGrey.visibility = View.INVISIBLE
            }
        }
        binding.textViewBtnFemaleGrey.setOnClickListener {
            if (binding.textViewBtnMaleGreen.visibility == View.VISIBLE) {
                binding.textViewBtnMaleGreen.visibility = View.INVISIBLE
                binding.textViewBtnMaleGrey.visibility = View.VISIBLE
                binding.textViewBtnFemaleGrey.visibility = View.INVISIBLE
                binding.textViewBtnFemaleGreen.visibility = View.VISIBLE
            } else {
                binding.textViewBtnFemaleGrey.visibility = View.INVISIBLE
                binding.textViewBtnFemaleGreen.visibility = View.VISIBLE
            }
        }
        binding.textViewBtnFemaleGreen.setOnClickListener {
            if (binding.textViewBtnMaleGreen.visibility == View.INVISIBLE) {
                binding.textViewBtnFemaleGrey.visibility = View.VISIBLE
                binding.textViewBtnFemaleGreen.visibility = View.INVISIBLE
            } else {
                binding.textViewBtnMaleGreen.visibility = View.INVISIBLE
                binding.textViewBtnMaleGrey.visibility = View.VISIBLE
                binding.textViewBtnFemaleGreen.visibility = View.VISIBLE
                binding.textViewBtnFemaleGrey.visibility = View.INVISIBLE
            }
        }

        // 3. MBTI 드롭다운
        val spinnerMbti: Spinner = binding.spinnerMbti
        ArrayAdapter.createFromResource(
            this,
            R.array.signup_mbti,
            R.layout.spinner_signup_item
        ).also { adapter ->
            adapter.setDropDownViewResource(R.layout.spinner_signup_dropdown)
            spinnerMbti.adapter = adapter
        }

        spinnerMbti.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long
            ) {
                checkOptions()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                checkOptions()
            }
        }

        // 4. 성격
        // 일단 dialog 안 띄우고 이 activity에서 동작하도록 하고 후에 디벨롭시키기
        binding.personal1Grey.setOnClickListener {
            binding.personal1Grey.visibility = View.INVISIBLE
            binding.personal1Green.visibility = View.VISIBLE
        }
        binding.personal1Green.setOnClickListener {
            binding.personal1Grey.visibility = View.VISIBLE
            binding.personal1Green.visibility = View.INVISIBLE
        }

        binding.personal2Grey.setOnClickListener {
            binding.personal2Grey.visibility = View.INVISIBLE
            binding.personal2Green.visibility = View.VISIBLE
        }
        binding.personal2Green.setOnClickListener {
            binding.personal2Grey.visibility = View.VISIBLE
            binding.personal2Green.visibility = View.INVISIBLE
        }

        binding.personal3Grey.setOnClickListener {
            binding.personal3Grey.visibility = View.INVISIBLE
            binding.personal3Green.visibility = View.VISIBLE
        }
        binding.personal3Green.setOnClickListener {
            binding.personal3Grey.visibility = View.VISIBLE
            binding.personal3Green.visibility = View.INVISIBLE
        }

        binding.personal4Grey.setOnClickListener {
            binding.personal4Grey.visibility = View.INVISIBLE
            binding.personal4Green.visibility = View.VISIBLE
        }
        binding.personal4Green.setOnClickListener {
            binding.personal4Grey.visibility = View.VISIBLE
            binding.personal4Green.visibility = View.INVISIBLE
        }

        binding.personal5Grey.setOnClickListener {
            binding.personal5Grey.visibility = View.INVISIBLE
            binding.personal5Green.visibility = View.VISIBLE
        }
        binding.personal5Green.setOnClickListener {
            binding.personal5Grey.visibility = View.VISIBLE
            binding.personal5Green.visibility = View.INVISIBLE
        }

        binding.personal6Grey.setOnClickListener {
            binding.personal6Grey.visibility = View.INVISIBLE
            binding.personal6Green.visibility = View.VISIBLE
        }
        binding.personal6Green.setOnClickListener {
            binding.personal6Grey.visibility = View.VISIBLE
            binding.personal6Green.visibility = View.INVISIBLE
        }

        binding.personal7Grey.setOnClickListener {
            binding.personal7Grey.visibility = View.INVISIBLE
            binding.personal7Green.visibility = View.VISIBLE
        }
        binding.personal7Green.setOnClickListener {
            binding.personal7Grey.visibility = View.VISIBLE
            binding.personal7Green.visibility = View.INVISIBLE
        }

        binding.personal8Grey.setOnClickListener {
            binding.personal8Grey.visibility = View.INVISIBLE
            binding.personal8Green.visibility = View.VISIBLE
        }
        binding.personal8Green.setOnClickListener {
            binding.personal8Grey.visibility = View.VISIBLE
            binding.personal8Green.visibility = View.INVISIBLE
        }

        binding.personal9Grey.setOnClickListener {
            binding.personal9Grey.visibility = View.INVISIBLE
            binding.personal9Green.visibility = View.VISIBLE
        }
        binding.personal9Green.setOnClickListener {
            binding.personal9Grey.visibility = View.VISIBLE
            binding.personal9Green.visibility = View.INVISIBLE
        }

        binding.personal10Grey.setOnClickListener {
            binding.personal10Grey.visibility = View.INVISIBLE
            binding.personal10Green.visibility = View.VISIBLE
        }
        binding.personal10Green.setOnClickListener {
            binding.personal10Grey.visibility = View.VISIBLE
            binding.personal10Green.visibility = View.INVISIBLE
        }

        binding.personal11Grey.setOnClickListener {
            binding.personal11Grey.visibility = View.INVISIBLE
            binding.personal11Green.visibility = View.VISIBLE
        }
        binding.personal11Green.setOnClickListener {
            binding.personal11Grey.visibility = View.VISIBLE
            binding.personal11Green.visibility = View.INVISIBLE
        }

        binding.personal12Grey.setOnClickListener {
            binding.personal12Grey.visibility = View.INVISIBLE
            binding.personal12Green.visibility = View.VISIBLE
        }
        binding.personal12Green.setOnClickListener {
            binding.personal12Grey.visibility = View.VISIBLE
            binding.personal12Green.visibility = View.INVISIBLE
        }

        binding.personal13Grey.setOnClickListener {
            binding.personal13Grey.visibility = View.INVISIBLE
            binding.personal13Green.visibility = View.VISIBLE
        }
        binding.personal13Green.setOnClickListener {
            binding.personal13Grey.visibility = View.VISIBLE
            binding.personal13Green.visibility = View.INVISIBLE
        }

        binding.personal14Grey.setOnClickListener {
            binding.personal14Grey.visibility = View.INVISIBLE
            binding.personal14Green.visibility = View.VISIBLE
        }
        binding.personal14Green.setOnClickListener {
            binding.personal14Grey.visibility = View.VISIBLE
            binding.personal14Green.visibility = View.INVISIBLE
        }

        binding.personal15Grey.setOnClickListener {
            binding.personal15Grey.visibility = View.INVISIBLE
            binding.personal15Green.visibility = View.VISIBLE
        }
        binding.personal15Green.setOnClickListener {
            binding.personal15Grey.visibility = View.VISIBLE
            binding.personal15Green.visibility = View.INVISIBLE
        }

        binding.personal16Grey.setOnClickListener {
            binding.personal16Grey.visibility = View.INVISIBLE
            binding.personal16Green.visibility = View.VISIBLE
        }
        binding.personal16Green.setOnClickListener {
            binding.personal16Grey.visibility = View.VISIBLE
            binding.personal16Green.visibility = View.INVISIBLE
        }

        binding.personal17Grey.setOnClickListener {
            binding.personal17Grey.visibility = View.INVISIBLE
            binding.personal17Green.visibility = View.VISIBLE
        }
        binding.personal17Green.setOnClickListener {
            binding.personal17Grey.visibility = View.VISIBLE
            binding.personal17Green.visibility = View.INVISIBLE
        }

        binding.personal18Grey.setOnClickListener {
            binding.personal18Grey.visibility = View.INVISIBLE
            binding.personal18Green.visibility = View.VISIBLE
        }
        binding.personal18Green.setOnClickListener {
            binding.personal18Grey.visibility = View.VISIBLE
            binding.personal18Green.visibility = View.INVISIBLE
        }

        binding.personal19Grey.setOnClickListener {
            binding.personal19Grey.visibility = View.INVISIBLE
            binding.personal19Green.visibility = View.VISIBLE
        }
        binding.personal19Green.setOnClickListener {
            binding.personal19Grey.visibility = View.VISIBLE
            binding.personal19Green.visibility = View.INVISIBLE
        }

        binding.personal20Grey.setOnClickListener {
            binding.personal20Grey.visibility = View.INVISIBLE
            binding.personal20Green.visibility = View.VISIBLE
        }
        binding.personal20Green.setOnClickListener {
            binding.personal20Grey.visibility = View.VISIBLE
            binding.personal20Green.visibility = View.INVISIBLE
        }

        binding.interest1Grey.setOnClickListener {
            binding.interest1Grey.visibility = View.INVISIBLE
            binding.interest1Green.visibility = View.VISIBLE
        }
        binding.interest1Green.setOnClickListener {
            binding.interest1Grey.visibility = View.VISIBLE
            binding.interest1Green.visibility = View.INVISIBLE
        }

        binding.interest2Grey.setOnClickListener {
            binding.interest2Grey.visibility = View.INVISIBLE
            binding.interest2Green.visibility = View.VISIBLE
        }
        binding.interest2Green.setOnClickListener {
            binding.interest2Grey.visibility = View.VISIBLE
            binding.interest2Green.visibility = View.INVISIBLE
        }

        binding.interest3Grey.setOnClickListener {
            binding.interest3Grey.visibility = View.INVISIBLE
            binding.interest3Green.visibility = View.VISIBLE
        }
        binding.interest3Green.setOnClickListener {
            binding.interest3Grey.visibility = View.VISIBLE
            binding.interest3Green.visibility = View.INVISIBLE
        }

        binding.interest4Grey.setOnClickListener {
            binding.interest4Grey.visibility = View.INVISIBLE
            binding.interest4Green.visibility = View.VISIBLE
        }
        binding.interest4Green.setOnClickListener {
            binding.interest4Grey.visibility = View.VISIBLE
            binding.interest4Green.visibility = View.INVISIBLE
        }

        binding.interest5Grey.setOnClickListener {
            binding.interest5Grey.visibility = View.INVISIBLE
            binding.interest5Green.visibility = View.VISIBLE
        }
        binding.interest5Green.setOnClickListener {
            binding.interest5Grey.visibility = View.VISIBLE
            binding.interest5Green.visibility = View.INVISIBLE
        }

        binding.interest6Grey.setOnClickListener {
            binding.interest6Grey.visibility = View.INVISIBLE
            binding.interest6Green.visibility = View.VISIBLE
        }
        binding.interest6Green.setOnClickListener {
            binding.interest6Grey.visibility = View.VISIBLE
            binding.interest6Green.visibility = View.INVISIBLE
        }

        binding.interest7Grey.setOnClickListener {
            binding.interest7Grey.visibility = View.INVISIBLE
            binding.interest7Green.visibility = View.VISIBLE
        }
        binding.interest7Green.setOnClickListener {
            binding.interest7Grey.visibility = View.VISIBLE
            binding.interest7Green.visibility = View.INVISIBLE
        }

        binding.interest8Grey.setOnClickListener {
            binding.interest8Grey.visibility = View.INVISIBLE
            binding.interest8Green.visibility = View.VISIBLE
        }
        binding.interest8Green.setOnClickListener {
            binding.interest8Grey.visibility = View.VISIBLE
            binding.interest8Green.visibility = View.INVISIBLE
        }

        binding.interest9Grey.setOnClickListener {
            binding.interest9Grey.visibility = View.INVISIBLE
            binding.interest9Green.visibility = View.VISIBLE
        }
        binding.interest9Green.setOnClickListener {
            binding.interest9Grey.visibility = View.VISIBLE
            binding.interest9Green.visibility = View.INVISIBLE
        }

        binding.interest10Grey.setOnClickListener {
            binding.interest10Grey.visibility = View.INVISIBLE
            binding.interest10Green.visibility = View.VISIBLE
        }
        binding.interest10Green.setOnClickListener {
            binding.interest10Grey.visibility = View.VISIBLE
            binding.interest10Green.visibility = View.INVISIBLE
        }

        binding.interest11Grey.setOnClickListener {
            binding.interest11Grey.visibility = View.INVISIBLE
            binding.interest11Green.visibility = View.VISIBLE
        }
        binding.interest11Green.setOnClickListener {
            binding.interest11Grey.visibility = View.VISIBLE
            binding.interest11Green.visibility = View.INVISIBLE
        }

        binding.interest12Grey.setOnClickListener {
            binding.interest12Grey.visibility = View.INVISIBLE
            binding.interest12Green.visibility = View.VISIBLE
        }
        binding.interest12Green.setOnClickListener {
            binding.interest12Grey.visibility = View.VISIBLE
            binding.interest12Green.visibility = View.INVISIBLE
        }

        binding.interest13Grey.setOnClickListener {
            binding.interest13Grey.visibility = View.INVISIBLE
            binding.interest13Green.visibility = View.VISIBLE
        }
        binding.interest13Green.setOnClickListener {
            binding.interest13Grey.visibility = View.VISIBLE
            binding.interest13Green.visibility = View.INVISIBLE
        }

        binding.interest14Grey.setOnClickListener {
            binding.interest14Grey.visibility = View.INVISIBLE
            binding.interest14Green.visibility = View.VISIBLE
        }
        binding.interest14Green.setOnClickListener {
            binding.interest14Grey.visibility = View.VISIBLE
            binding.interest14Green.visibility = View.INVISIBLE
        }

        binding.interest15Grey.setOnClickListener {
            binding.interest15Grey.visibility = View.INVISIBLE
            binding.interest15Green.visibility = View.VISIBLE
        }
        binding.interest15Green.setOnClickListener {
            binding.interest15Grey.visibility = View.VISIBLE
            binding.interest15Green.visibility = View.INVISIBLE
        }

        binding.interest16Grey.setOnClickListener {
            binding.interest16Grey.visibility = View.INVISIBLE
            binding.interest16Green.visibility = View.VISIBLE
        }
        binding.interest16Green.setOnClickListener {
            binding.interest16Grey.visibility = View.VISIBLE
            binding.interest16Green.visibility = View.INVISIBLE
        }

        binding.interest17Grey.setOnClickListener {
            binding.interest17Grey.visibility = View.INVISIBLE
            binding.interest17Green.visibility = View.VISIBLE
        }
        binding.interest17Green.setOnClickListener {
            binding.interest17Grey.visibility = View.VISIBLE
            binding.interest17Green.visibility = View.INVISIBLE
        }

        binding.interest18Grey.setOnClickListener {
            binding.interest18Grey.visibility = View.INVISIBLE
            binding.interest18Green.visibility = View.VISIBLE
        }
        binding.interest18Green.setOnClickListener {
            binding.interest18Grey.visibility = View.VISIBLE
            binding.interest18Green.visibility = View.INVISIBLE
        }

        binding.interest19Grey.setOnClickListener {
            binding.interest19Grey.visibility = View.INVISIBLE
            binding.interest19Green.visibility = View.VISIBLE
        }
        binding.interest19Green.setOnClickListener {
            binding.interest19Grey.visibility = View.VISIBLE
            binding.interest19Green.visibility = View.INVISIBLE
        }

        binding.interest20Grey.setOnClickListener {
            binding.interest20Grey.visibility = View.INVISIBLE
            binding.interest20Green.visibility = View.VISIBLE
        }
        binding.interest20Green.setOnClickListener {
            binding.interest20Grey.visibility = View.VISIBLE
            binding.interest20Green.visibility = View.INVISIBLE
        }
        
        //
        binding.textViewBtnNext5Green.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    // . 기본 정보 입력 완료 확인 함수
    private fun checkOptions() {
        // textViewBtnCheckAuthGrey 추가 (여기 다시 검토 - 임시)
        if(binding.spinnerMbti.selectedItem.toString().length != 4 ) {

        } else {

        }
    }
}