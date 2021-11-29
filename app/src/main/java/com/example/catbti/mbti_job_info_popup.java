package com.example.catbti;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class mbti_job_info_popup extends Activity {
    String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature( Window.FEATURE_NO_TITLE );
        setContentView(R.layout.activity_mbti_job_info_popup);

        TextView titleText = findViewById(R.id.testpopTitleText);
        TextView jobInfoText = findViewById(R.id.testIText);
        Button closeBtn = findViewById(R.id.testPopupCloseBtn);
        Button jobLinkBtn = findViewById(R.id.jobLinkBtn);
        ImageView imageJobMBTI  = (ImageView)findViewById(R.id.jobMBTIImage);

        Intent intent = getIntent();
        String mbti = intent.getStringExtra("mbti");
        String jobName = intent.getStringExtra("jobName");
        titleText.setText(" "+mbti+"와 어울리는 직업 : "+jobName);




        if(jobName.equals("CEO")){
            String CEO = " CEO의 특징은 리더쉽, 비전, 결단력입니다. 사람들을 동기화시키고 이끄는 것에 특출한 "+mbti+"의 여러분들은 뛰어난 리더쉽을 보유하여 사람들을 이끌어 갈 수 있고 이상적인 비전으로 미래로 이끌 힘을 가지고 있습니다. 마지막으로 확고한 결단력으로 여러분의 손익을 조절 할 능력을 가지고 있기 때문에 “CEO“라는 직업을 추천 드립니다.";
            jobInfoText.setText(CEO);
            link = "https://smubiz.smu.ac.kr/smubiz/index.do";
            imageJobMBTI.setImageResource(R.drawable.enfj_job);
        }

        else if(jobName.equals("언어교사")){
            String language_teacher = " 언어교사의 특징은 표현력, 공감능력, 열정입니다. 누군가의 마음에 공감을 잘 해주는 "+mbti+"의 여러분들은 특출한 표현력으로 아이들에게 많은 영감을 심어줄 수 있고 뛰어난 공감능력으로 그들의 마음을 잘 헤아려 줄 수 있습니다. 마지막으로 누구보다 뛰어난 열정을 가지고 있기 때문에 “언어교사”라는 직업을 추천 드립니다.";
            jobInfoText.setText(language_teacher);
            link = "https://peda.smu.ac.kr/peda/index.do";
            imageJobMBTI.setImageResource(R.drawable.enfj_job2);
        }

        else if(jobName.equals("영화감독")){
            String movie = " 영화감독의 특징은 독창성, 카리스마, 객관성입니다. 넘치는 아이디어를 보유하고 게신 "+mbti+"의 여러분들은 독창적인 아이디어로 새로운 연출을 선보일 수 있고 날카로운 카리스마로 다른 이들을 통제 할 수 있으며 객관적인 시선으로 작품들을 더 뛰어나게 다듬을 수 있기 때문에 “영화감독”이라는 직업을 추천 드립니다.";
            jobInfoText.setText(movie);
            link = "https://movie.smu.ac.kr/movie/index.do";
        }

        else if(jobName.equals("벤처사업가")){
            String venture = " 벤처사업가의 특징은 사상가, 다식, 객관성입니다. 예리한 눈으로 미래를 지향할 수 있는 "+mbti+"의 여러분들은 아이디어를 유연하게 전환 할 수 있는 사상가 적인 생각을 보유 하고 있으며 다양한 지식을 보유 할 머리를 가지고 있습니다. 마지막으로 객관적인 판단으로 벤처기업들의 경영을 이끌어 나갈 힘을 가지고 있기 때문에 “벤처 사업가” 라는 직업을 추천 드립니다.";
            jobInfoText.setText(venture);
            link = "https://smubiz.smu.ac.kr/smubiz/index.do";
        }

        else if(jobName.equals("경제학자")){
            String economist = "경제학자의 특징은 분석력, 비판적, 개방적입니다. 엘리트 적인 면을 가지고 있는 "+mbti+"의 여러분 들은 뛰어난 분석력으로 사회의 경제 시장을 분석 할 수 있습니다. 또한 체계적인 비판으로 올바른 판단을 할 수 있고, 개방적인 마인드로 얻어낸 아이디어들을 경제학에 이용 할 수 있는 능력을 보유하고 있기 때문에 “경제학자”라는 직업을 추천 드립니다.";
            jobInfoText.setText(economist);
            imageJobMBTI.setImageResource(R.drawable.entj_job1);
            link = "https://econo.smu.ac.kr/economic/index.do";
        }

        else if(jobName.equals("디자이너")){
            String designer = " 디자이너의 특징은 관찰력, 표현력, 열정입니다. 방대한 양의 에너지를 보유한 "+mbti+"의 여러분들은 뛰어난 관찰력으로 당신의 시아속의 움직임을 놓치지 않고 잡아낼 수 있으며 잡아낸 움직임들을 당신의 표현력으로 새롭게 나타낼 수 있습니다. 또한 이 모든 걸 끊임없이 해낼 수 있는 열정을 가지고 있기 때문에 “디자이너”라는 직업을 추천 드립니다.";
            jobInfoText.setText(designer);
            link = "https://www.smu.ac.kr/visual/index.do";
        }

        else if(jobName.equals("방송프로듀서")){
            String broadcast = " 방송 프로듀서의 특징은 호기심, 활력, 커뮤니케이션입니다. 재기발랄 한 성향을 가지고 있는 "+mbti+"의 여러분들은 다양한 호기심으로 많은 것들로부터 영감을 얻어 당신의 기획력으로 바꿀 수 있습니다. 또한 넘치는 활력을 바탕으로 다른 동료들과 뛰어난 커뮤니케이션을 통해 방송을 제작해 나갈 수 있기 때문에 “방송 프로듀서”라는 직업을 추천 드립니다.";
            jobInfoText.setText(broadcast);
            link = "https://digitalcontents.smu.ac.kr/digital/index.do";
        }

        else if(jobName.equals("특수교사")){
            String special = " 특수교사의 특징은 공감능력, 포옹력, 섬세함입니다. 선의의 마음을 가지고 있는 "+mbti+"의 여러분들은 뛰어난 공감능력으로 아이들의 아픔을 이해할 수 있습니다. 또한 넓은 포옹력으로 그들의 결함을 받아들이고 당신의 섬세함으로 그 결함들을 해결하는데 도움을 줄 수 있습니다. 때문에 “특수교사”라는 직업을 추천 드립니다.";
            jobInfoText.setText(special);
            link = "https://peda.smu.ac.kr/peda/index.do";
        }

        else if(jobName.equals("아트디렉터")){
            String art = "아트디렉터의 특징은 예술성, 창의력, 표현력입니다. 뛰어난 미적 능력을 잠재하고 있는 "+mbti+"의 여러분들은 예술성을 가지고 있고 사람들을 놀라게 할 창의력을 가지고 있습니다. 뿐만 아니라 당신의 예술성과 창의력을 미적으로 표현해 낼 수 있는 표현력을 보유하고 있기 때문에 “아트디렉터”라는 직업을 추천 드립니다. ";
            jobInfoText.setText(art);
            link = "https://interior.smu.ac.kr/interior/index.do";
        }

        else if(jobName.equals("연구원")){
            String researcher = "  연구원의 특징은 호기심, 이론성, 목표 지향적입니다. 예상치 못할 성공을 가져올 힘을 가진 "+mbti+"의 여러분들은 깊은 호기심으로 알고자 하는 사실에 높은 학구열을 가지고 있습니다. 또한 이 호기심에 이론적인 면을 더하여 객관화 시킬 능력을 가지고 있습니다. 마지막으로 목표 지향적인 생각으로 하고자 한 일에 꾸준한 노력을 할 수 있기 때문에 “연구원”이라는 직업을 추천 드립니다.";
            jobInfoText.setText(researcher);
            link = "https://biotechnology.smu.ac.kr/biotechnology/index.do";
        }

        else if(jobName.equals("경영 컨설턴트")){
            String consultant = " 경영 컨설턴트의 특징은 유동성, 계획성, 호기심입니다. 뛰어난 통찰력을 가지고 있는 "+mbti+"의 여러분들은  시대의 변화에 따라 유동적으로 생각을 할 수 있고 높은 계획성으로 기업의 미래 경영을 만들어 나갈 수 있습니다. 또한 뛰어난 호기심으로 얻은 지식을 자신의 것으로 만들어 내 새로운 경영 방법을 생각해 낼 수 있는 능력을 가지고 있기 때문에 “경영 컨설턴트”라는 직업을 추천 드립니다.";
            jobInfoText.setText(consultant);
            imageJobMBTI.setImageResource(R.drawable.entj_job2);
            link = "https://smubiz.smu.ac.kr/smubiz/index.do";
        }

        else if(jobName.equals("작곡가")){
            String composer = " 작곡가의 특징은 창의성, 공감능력, 섬세함입니다. 크리에이터의 기질을 가진 "+mbti+"의 여러분들은 뛰어난 창의성으로 사람들에게 영감을 주는 가사를 만들어 낼 수 있습니다. 또한  가사 하나하나에 섬세한 표현으로, 많은 이들의 공감을 얻는 능력을 보유하고 있기 때문에 음악을 좋아하신다면 “작곡가”라는 직업을 추천 드립니다.";
            jobInfoText.setText(composer);
            link = "https://music.smu.ac.kr/music/index.do";
        }

        else if(jobName.equals("작가")){
            String author = "작가의 특징은 몽상, 열성, 영감입니다. 다양한 재미있는 상상을 하는 것을 즐기는 "+mbti+"의 여러분 들은 다양한 몽상을 보유하고 있습니다. 또한 삶의 여러 요소에서 영감을 받아 이상적인 생각을 잘 하기 때문에 자신의 상상을 사람들에게 보여주고 싶다면 “작가”라는 직업을 추천 드립니다.";
            jobInfoText.setText(author);
            link = "https://edu.ktrwa.or.kr/web/user/main.do";
        }

        else if(jobName.equals("교사")){
            String teacher = " 교사의 특징은 정직, 헌신, 리더쉽입니다. 다른 이들보다 더 성숙한 생각을 가지고 있는 "+mbti+"의 여러분들은 정의에 대한 높은 이해력으로 아직 미숙한 아이들에게 정직과 질서를 가르칠 수 있습니다. 또한 아이들을 올바른 길로 이끌 수 있는 리더쉽을 보유하고 있기 때문에  “교사”라는 직업을 추천 드립니다.";
            jobInfoText.setText(teacher);
            link = "https://peda.smu.ac.kr/peda/index.do";
        }

        else if(jobName.equals("빅데이터 전문가")){
            String bigdata = " 빅데이터 전문가의 특징은 관찰력, 통찰력입니다. 뛰어난 관찰력을 보유한 "+mbti+"의 여러분들은 빅데이터를 분석을 기반으로 한 시장의 미래 분석 등에 용의 주도 합니다. 또한 높은 통찰력으로 주어진 데이터를 이용한 올바른 미래 예견을 할 수 있기 때문에 “빅데이터 전문가”라는 직업을 추천 드립니다.\n";
            jobInfoText.setText(bigdata);
            link = "https://fbs.smu.ac.kr/fbs/index.do";
        }

        else if(jobName.equals("물리치료사")){
            String physical = " 물리치료사의 특징은 지원적, 신실성, 열정입니다. 든든한 사회의 수호자인 "+mbti+"의 여러분들은 항상 다른 이들을 돕고자 합니다. 또한 신실적이고 , 넘치는 열정을 보유하고 있기 때문에 신체적으로 장애가 있는 환자들 에게도 거리낌 없이 다가 갈 수 있는 성격을 보유 하고 있기 때문에 “물리치료사” 라는 직업을 추천 드립니다.";
            jobInfoText.setText(physical);
            link = "https://sportforall.smu.ac.kr/sportforall/index.do";
        }

        else if(jobName.equals("사업가")){
            String businessman = " 사업가의 특징은 사교성, 관찰력, 유동성입니다. 대담한 모험을 즐기는 "+mbti+"의 여러분들은 누구보다 뛰어난 사교성으로 다양한 사람들과 친해지는 데에 어려움을 겪지 않습니다. 또한 뛰어난 관찰력으로 사회 시장의 구조를 이해 할 수 있고 유동적인 생각으로 다양한 아이디어를 추구하기 때문에 “사업가”라는 직업을 추천 드립니다.";
            jobInfoText.setText(businessman);
            link = "https://econo.smu.ac.kr/economic/index.do";
        }

        else if(jobName.equals("감독관")){
            String inspector = "감독관의 특징은 책임, 정직, 객관입니다. 청렴결백하고 정의로운 "+mbti+"의 여러분들은 책임감을 중요시 합니다. 정직한 규율에 따라 단체를 지휘하고, 감독할 수 있고. 그와 동시에 객관적으로 상황을 분석하여 일을 해결할 수 있는 능력을 보유하고 있습니다. 따라서 “감독관”이라는 직업을 추천합니다. ";
            jobInfoText.setText(inspector);
            link = "https://public.smu.ac.kr/public/index.do";
        }

        else if(jobName.equals("음향디자이너")){
            String sound = " 음디자이너의 특징은 관찰력, 표현력, 열정입니다. 예측할 수 없는 매력을 가진 "+mbti+"의 여러분들은 뛰어난 관찰력으로 당신의 시아속의 움직임을 놓치지 않고 잡아낼 수 있으며 잡아낸 움직임들을 당신의 표현력으로 새롭게 나타낼 수 있습니다. 또한 이 모든 걸 끊임없이 해낼 수 있는 열정을 가지고 있기 때문에 “음향 디자이너”라는 직업을 추천 드립니다.";
            jobInfoText.setText(sound);
            link = "https://music.smu.ac.kr/music/index.do";
        }


        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        jobLinkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linkIntent = new Intent(Intent.ACTION_VIEW);
                linkIntent.setData(Uri.parse(link));
                startActivity(linkIntent);
            }
        });


    }
}