package ca.mcgill.ecse321.tutoringapp.Database.src;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

import javax.persistence.Id;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Set;
import javax.persistence.ManyToMany;

@Entity
public class Session{
	private SessionType type;

	public void setType(SessionType value) {
		this.type = value;
	}
	public SessionType getType() {
		return this.type;
	}
	private Date date;

	public void setDate(Date value) {
		this.date = value;
	}
	public Date getDate() {
		return this.date;
	}
	private Room room;

	@ManyToOne
	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	private Tutor tutor;

	@ManyToOne(optional=false)
	public Tutor getTutor() {
		return this.tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	private Set<Student> student;

	@ManyToMany
	public Set<Student> getStudent() {
		return this.student;
	}

	public void setStudent(Set<Student> students) {
		this.student = students;
	}

	private Course course;

	@ManyToOne(optional=false)
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	private Manager manager;

	@ManyToOne(optional=false)
	public Manager getManager() {
		return this.manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	private Time startTime;

	public void setStartTime(Time time) {
		this.startTime = time;
	}
	public Time getStartTime() {
		return this.startTime;
	}
	private Time endTime;

	public void setEndTime(Time value) {
		this.endTime = value;
	}
	public Time getEndTime() {
		return this.endTime;
	}
	@GeneratedValue private int sessionID;

	public void setSessionID(int value) {
		this.sessionID = value;
	}
	@Id
	public int getSessionID() {
		return this.sessionID;
	}
}
