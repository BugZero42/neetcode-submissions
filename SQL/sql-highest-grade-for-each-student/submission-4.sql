-- Write your query below
SELECT student_id, min(exam_id) as exam_id, score
FROM exam_results e
WHERE score = (
    SELECT MAX(score)
    FROM exam_results e2
    WHERE student_id = e.student_id
)
group by student_id, score;