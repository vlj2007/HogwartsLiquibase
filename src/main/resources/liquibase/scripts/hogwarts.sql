-- liquibase formatted sql

-- changeset vpotapov:1
CREATE INDEX student_search_name_index ON student (name);
SELECT * FROM student WHERE name='';
-- changeset vpotapov:2
CREATE INDEX faculty_search_name_and_color_index ON faculty (name, color);
SELECT * FROM faculty WHERE name='' and color='';