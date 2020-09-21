package com.sejin.classbell;

public class Timetable {
    private String className;                   // 과목명
    private String professor;                   // 교수명
    private int hours = 1;                      // 연강 개수
    private boolean is_alarm_on;                // 알람 확인
    private boolean is_online;                  // 온라인 수업 확인
    private boolean is_attendance_check_app;    // 학교출결앱 연결 확인
    private String checkapp_url;                // 학교출결앱 주소

    public Timetable(String className, String professor, int hours, boolean is_alarm_on, boolean is_online, boolean is_attendance_check_app, String checkapp_url) {
        this.className = className;
        this. professor = professor;
        this.hours = hours;
        this.is_alarm_on = is_alarm_on;
        this.is_online = is_online;
        this.is_attendance_check_app = is_attendance_check_app;
        this.checkapp_url = checkapp_url;
    }
}
