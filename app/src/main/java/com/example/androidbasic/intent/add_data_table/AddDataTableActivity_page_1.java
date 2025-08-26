package com.example.androidbasic.intent.add_data_table;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

public class AddDataTableActivity_page_1 extends fullscreen {

    String[] headers = {"ID", "Name", "Email", "Address"};
    String[][] data = {
            {"1", "Nguyen Van A", "a@example.com", "123 Long Street, Hanoi"},
            {"2", "Tran Thi B", "b@example.com", "456 Another Road, Ho Chi Minh"},
            {"3", "Le Van C", "c@example.com", "789 Some Place, Da Nang"},
            {"4", "Pham Thi D", "d@example.com", "101 Random Ave, Hue"},
            {"5", "Nguyen Van E", "e@example.com", "Very very long address to test line wrap in table cell"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_add_data_table_page_1);

        TableLayout tableLayout = findViewById(R.id.tableLayout);

        // Tạo header
        TableRow headerRow = new TableRow(this);
        for (String header : headers) {
            TextView tv = createTextView(header, true);
            headerRow.addView(tv);
        }
        tableLayout.addView(headerRow);

        // Tạo dữ liệu
        for (String[] row : data) {
            TableRow tableRow = new TableRow(this);
            for (String cell : row) {
                TextView tv = createTextView(cell, false);
                tableRow.addView(tv);
            }
            tableLayout.addView(tableRow);
        }
    }

    private TextView createTextView(String text, boolean isHeader) {
        TextView tv = new TextView(this);
        tv.setText(text);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        tv.setPadding(50, 50, 50, 50);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(isHeader ? Color.LTGRAY : Color.WHITE);
        tv.setTextColor(Color.BLACK);

        // Viền
        tv.setBackgroundDrawable(getResources().getDrawable(R.drawable.cell_border));

        tv.setMaxWidth(800);
        tv.setMinWidth(100);

        // 🚀 Không xuống dòng, cắt chữ và thêm "..."
        tv.setSingleLine(true);
        tv.setEllipsize(android.text.TextUtils.TruncateAt.END);

        // 🚀 LayoutParams để cell trong cùng hàng có chiều cao đều nhau
        TableRow.LayoutParams params = new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.MATCH_PARENT
        );
        tv.setLayoutParams(params);

        return tv;
    }


}
