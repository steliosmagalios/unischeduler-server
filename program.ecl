and_gate(0, 0, 0).
and_gate(0, 1, 0).
and_gate(1, 0, 0).
and_gate(1, 1, 1).

or_gate(0, 0, 0).
or_gate(0, 1, 1).
or_gate(1, 0, 1).
or_gate(1, 1, 1).

not_gate(0, 1).
not_gate(1, 0).

xor_gate(A, B, X) :-
  not_gate(A, AP),
  not_gate(B, BP),

  and_gate(AP, B, R1),
  and_gate(A, BP, R2),

  or_gate(R1, R2, X).
