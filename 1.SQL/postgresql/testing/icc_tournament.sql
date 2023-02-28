CREATE TABLE cricket (
	team_1 text,
	team_2 text,
	winner text
);

INSERT INTO cricket
VALUES ('India', 'SL', 'India'),
('SL', 'Aus', 'Aus'),
('SA', 'Eng', 'Eng'),
('Eng', 'NZ', 'NZ'),
('Aus', 'India', 'India');

SELECT
	team,
	COUNT(*) AS matches_played,
	SUM(CASE WHEN team = winner THEN 1 ELSE 0 END) AS no_of_wins,
	SUM(CASE WHEN team <> winner THEN 1 ELSE 0 END) AS no_of_losses
	FROM (
		SELECT team_1 AS team, winner FROM cricket
		UNION ALL
		SELECT team_2 AS team, winner FROM cricket
	)
GROUP BY team;

