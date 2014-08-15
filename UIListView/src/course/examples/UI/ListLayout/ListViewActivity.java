package course.examples.UI.ListLayout;

import java.util.ArrayList;
import java.util.Random;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nyul.androidgroupapp3.dialogue.DialogueMaker;

public class ListViewActivity extends ListActivity {
	DialogueMaker dialogueMaker = new DialogueMaker(this);

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
				getResources().getStringArray(R.array.Days)));
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				
				if( id == 0){
					dialogueMaker.message("Monday's exercise", " Spend 10 Minutes running, 15 push ups");	
				}

				if (id == 1)
				{	dialogueMaker.message("Tuesday's exercise", " Do 20 Sit ups");

				}
				if ( id == 2) { 
					dialogueMaker.message("Wednesday's exercise", "Spend 10 Minutes running, do 25 sit ups and crunches");
				}
				if ( id == 3) {
					dialogueMaker.message("Thursday's exercise", "Do 30 burpees, do 20 jumping jacks");
				}
				if ( id == 4) {
					dialogueMaker.message("Friday's exercise", "Spend 10 minutes running, do 20 push ups");

				}
				if ( id == 5) {
					dialogueMaker.message("Saturday's exercise", "Spend 10 minutes running, do 35 squats");
				}
				if ( id == 6){
					dialogueMaker.message("Sunday's exercise", "Rest day if you haven't already died :)");
				}
				
					if (id == 7) {
						ArrayList<String> list = new ArrayList<String> (); 
						list.add("Good Job");
						list.add(" When you want to give up, think on why you started");
						list.add ("Keep trying ");
						list.add("Your Earn Your Body");
						list.add("You can feel sore tomorrow or you can feel sorry tomorrow. You choose");
						list.add("Let exersie be your stress reliever , NOT FOOD"); 
						list.add("Don't Quit. You're already in pain. You're already hurt. Get a reward from it.");
						list.add("Dont be lazy or we will find you");
						list.add("Good things come to those who work out ");
						list.add("Don't just go through the motions give it 100%");
						list.add("People who work out become more focused ");
						list.add("Suffer the pain of discipline or suffer the pain of regret.");
						Random r = new Random();
						
					String m=list.get( r.nextInt( list.size() ) );
						
						
						dialogueMaker.message("Movtivation :)", m);
						
					}
				
								
			}
		});
	}
}








