<?php

	$db = new SQLite3('db.db');
	$db->exec('CREATE TABLE user (name STRING)');
	$db->exec('INSERT INTO user VALUES ("Name")');
	$result = $db->query('SELECT * FROM user');
	var_dump($result->fetchArray());
?>
