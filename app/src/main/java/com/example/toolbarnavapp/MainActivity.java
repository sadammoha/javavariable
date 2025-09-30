package com.example.toolbarnavapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

	private DrawerLayout drawerLayout;
	private NavigationView navigationView;
	private MaterialToolbar toolbar;
	private ActionBarDrawerToggle drawerToggle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		drawerLayout = findViewById(R.id.drawer_layout);
		navigationView = findViewById(R.id.navigation_view);

		drawerToggle = new ActionBarDrawerToggle(
			this,
			drawerLayout,
			R.string.nav_open,
			R.string.nav_close
		);
		drawerLayout.addDrawerListener(drawerToggle);
		drawerToggle.syncState();

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item) {
				int id = item.getItemId();
				String title = item.getTitle().toString();
				Toast.makeText(MainActivity.this, title, Toast.LENGTH_SHORT).show();
				if (getSupportActionBar() != null) {
					getSupportActionBar().setTitle(title);
				}
				drawerLayout.closeDrawer(GravityCompat.START);
				return true;
			}
		});

	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		if (drawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
