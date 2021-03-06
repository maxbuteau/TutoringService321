function SubjectDto(name, school, description) {
    this.name = name;
    this.school = school;
    this.description = description;
}

export default {
    name : 'subject',
    data() {
        return {
            subjects: [],
            NewSubject: '',
            subjectName: '',
            errorSubject: '',
            errorNewSubject: '',
        }
    },


    created: function () {
        
        const  s1 = new SubjectDto('Math', 'McGill', 'First Class');
        const s2 = new SubjectDto('English', 'Concordia', 'Intro');
        this.subjects = [s1,s2];
        
    },
    
    methods: {
        createSubject: function(subjectName, schoolName, desc) {

            var p = new SubjectDto(subjectName, schoolName, desc);
            this.subjects.push(p);
            this.NewSubject = '';
        }
    }
}