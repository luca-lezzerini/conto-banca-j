import { Cliente } from "../gestione-cliente/cliente";
import { ContoPrestito } from "../gestione-cp/conto-prestito";

export class AssociaCPDto{

    cliente: Cliente;
    contoPrestito: ContoPrestito;
}