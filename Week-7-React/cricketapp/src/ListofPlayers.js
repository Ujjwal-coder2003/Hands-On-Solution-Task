import React from 'react';

export function ListofPlayers({ players }) {
  return (
    <div>
      {players.map((item) => (
        <li key={item.name}>
          Mr. {item.name} <span>{item.score}</span>
        </li>
      ))}
    </div>
  );
}

export function Scorebelow70({ players }) {
  let players70 = [];
  players.map((item) => {
    if (item.score <= 70) {
      players70.push(item);
    }
    return null;
  });

  return (
    <div>
      {players70.map((item) => (
        <li key={item.name}>
          Mr. {item.name} <span>{item.score}</span>
        </li>
      ))}
    </div>
  );
}
