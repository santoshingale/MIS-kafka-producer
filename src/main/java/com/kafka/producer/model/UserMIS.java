package com.kafka.producer.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_engagement_MIS")
public class UserMIS {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public int candidate_id;
    public LocalDateTime Date_Time;
    public long Cpu_Count;
    public double Cpu_Working_Time;
    public double Cpu_idle_Time;
    public double cpu_percent;
    public long Usage_cpu_count;
    public double number_of_software_interrupts_since_boot;
    public long number_of_system_calls_since_boot;
    public long number_of_interrupts_since_boot;
    public double cpu_avg_load_over_1_min;
    public double cpu_avg_load_over_5_min;
    public double cpu_avg_load_over_15_min;
    public long system_total_memory;
    public long system_used_memory;
    public long system_free_memory;
    public long system_active_memory;
    public long system_inactive_memory;
    public long system_buffers_memory;
    public long system_cached_memory;
    public long system_shared_memory;
    public long system_avalible_memory;
    public long disk_total_memory;
    public long disk_used_memory;
    public long disk_free_memory;
    public long disk_read_count;
    public long disk_write_count;
    public long disk_read_bytes;
    public long disk_write_bytes;
    public long time_spent_reading_from_disk;
    public long time_spent_writing_to_disk;
    public long time_spent_doing_actual_Input_Output;
    public long number_of_bytes_sent;
    public long number_of_bytes_received;
    public long number_of_packets_sent;
    public long total_number_of_errors_while_receiving;
    public long total_number_of_errors_while_sending;
    public long total_number_of_incoming_packets_which_were_dropped;
    public long total_number_of_outgoing_packets_which_were_dropped;
    public String boot_time;
    public long keyboard;
    public long mouse;
    public String technology;
    public long files_changed;

    @Override
    public String toString() {
        return "UserMIS{" +
                "id=" + id +
                ", candidate_id=" + candidate_id +
                ", Date_Time=" + Date_Time +
                ", Cpu_Count=" + Cpu_Count +
                ", Cpu_Working_Time=" + Cpu_Working_Time +
                ", Cpu_idle_Time=" + Cpu_idle_Time +
                ", cpu_percent=" + cpu_percent +
                ", Usage_cpu_count=" + Usage_cpu_count +
                ", number_of_software_interrupts_since_boot=" + number_of_software_interrupts_since_boot +
                ", number_of_system_calls_since_boot=" + number_of_system_calls_since_boot +
                ", number_of_interrupts_since_boot=" + number_of_interrupts_since_boot +
                ", cpu_avg_load_over_1_min=" + cpu_avg_load_over_1_min +
                ", cpu_avg_load_over_5_min=" + cpu_avg_load_over_5_min +
                ", cpu_avg_load_over_15_min=" + cpu_avg_load_over_15_min +
                ", system_total_memory=" + system_total_memory +
                ", system_used_memory=" + system_used_memory +
                ", system_free_memory=" + system_free_memory +
                ", system_active_memory=" + system_active_memory +
                ", system_inactive_memory=" + system_inactive_memory +
                ", system_buffers_memory=" + system_buffers_memory +
                ", system_cached_memory=" + system_cached_memory +
                ", system_shared_memory=" + system_shared_memory +
                ", system_avalible_memory=" + system_avalible_memory +
                ", disk_total_memory=" + disk_total_memory +
                ", disk_used_memory=" + disk_used_memory +
                ", disk_free_memory=" + disk_free_memory +
                ", disk_read_count=" + disk_read_count +
                ", disk_write_count=" + disk_write_count +
                ", disk_read_bytes=" + disk_read_bytes +
                ", disk_write_bytes=" + disk_write_bytes +
                ", time_spent_reading_from_disk=" + time_spent_reading_from_disk +
                ", time_spent_writing_to_disk=" + time_spent_writing_to_disk +
                ", time_spent_doing_actual_Input_Output=" + time_spent_doing_actual_Input_Output +
                ", number_of_bytes_sent=" + number_of_bytes_sent +
                ", number_of_bytes_received=" + number_of_bytes_received +
                ", number_of_packets_sent=" + number_of_packets_sent +
                ", total_number_of_errors_while_receiving=" + total_number_of_errors_while_receiving +
                ", total_number_of_errors_while_sending=" + total_number_of_errors_while_sending +
                ", total_number_of_incoming_packets_which_were_dropped=" + total_number_of_incoming_packets_which_were_dropped +
                ", total_number_of_outgoing_packets_which_were_dropped=" + total_number_of_outgoing_packets_which_were_dropped +
                ", boot_time='" + boot_time + '\'' +
                ", keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", technology='" + technology + '\'' +
                ", files_changed=" + files_changed +
                '}';
    }

    public UserMIS() {
    }
}
