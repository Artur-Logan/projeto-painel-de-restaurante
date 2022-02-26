package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Integer tiposDeAlimentos, tiposDeBebidas, codigoInicialDesejado, tiposDeAcompanhamento, quantidades, finalizarPedido;
        Double preçoTotal = 0.00;

        System.out.println("Olá");
        System.out.println("Digite o codigo do que você deseja");
        System.out.println("1. Comida");
        System.out.println("2. Bebida");
        System.out.println("3. Acompanhamento");
        System.out.println("0. Para saber seu preço");
        System.out.println("-----------------------------------------------------------------");

        codigoInicialDesejado = sc.nextInt();

        if (codigoInicialDesejado == 1) {
            System.out.println("Digite o codigo da sua comida de sua preferencia e a quantidade:");
            System.out.println("1. Bife grelhado: R$ 10.00");
            System.out.println("2. Hamburger: R$ 13.50");
            System.out.println("3. Feijoada: R$ 15.00");
            System.out.println("4. Salada de frutas: R$ 17.00");
            System.out.println("5. Sanduiche natural: R$ 13.00");

            tiposDeAlimentos = sc.nextInt();
            quantidades = sc.nextInt();

            if (tiposDeAlimentos == 1) {
                preçoTotal = quantidades * 10.00;
            } else if (tiposDeAlimentos == 2) {
                preçoTotal = quantidades * 13.5;
            } else if (tiposDeAlimentos == 3) {
                preçoTotal = quantidades * 15.00;
            } else if (tiposDeAlimentos == 4) {
                preçoTotal = quantidades * 17.00;
            } else if (tiposDeAlimentos == 5) {
                preçoTotal = quantidades * 13.00;
            }

            System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
            System.out.println("Deseja finalizar o pedido?");
            System.out.println("1. Sim");
            System.out.println("2. CANCELAR PEDIDO!!!");
            System.out.println("3. Voltar ao painel principal");
            System.out.println("-----------------------------------------------------------------");

            finalizarPedido = sc.nextInt();

            if (finalizarPedido == 1) {
                System.out.printf("Pedido Finalizado!!! Total a Pagar: R$ %.2f%n", preçoTotal);
            } else if (finalizarPedido == 2) {
                System.out.println("PEDIDO CANCELADO!!!");//  como "terminar" o programa no pedido cancelado???
            } else if (finalizarPedido == 3) {
                System.out.println("Olá");
                System.out.println("Digite o codigo do que você deseja");
                System.out.println("1. Comida");
                System.out.println("2. Bebida");
                System.out.println("3. Acompanhamento");
                System.out.println("0. Para saber seu preço");
                System.out.println("-----------------------------------------------------------------");

                codigoInicialDesejado = sc.nextInt();

                if (codigoInicialDesejado == 1) {
                    System.out.println("Digite o codigo da sua comida de sua preferencia e a quantidade:");
                    System.out.println("1. Bife grelhado: R$ 10.00");
                    System.out.println("2. Hamburger: R$ 13.50");
                    System.out.println("3. Feijoada: R$ 15.00");
                    System.out.println("4. Salada de frutas: R$ 17.00");
                    System.out.println("5. Sanduiche natural: R$ 13.00");

                    tiposDeAlimentos = sc.nextInt();
                    quantidades = sc.nextInt();

                    if (tiposDeAlimentos == 1) {
                        preçoTotal += (quantidades * 10.00);
                    } else if (tiposDeAlimentos == 2) {
                        preçoTotal += quantidades * 13.5;
                    } else if (tiposDeAlimentos == 3) {
                        preçoTotal += quantidades * 15.00;
                    } else if (tiposDeAlimentos == 4) {
                        preçoTotal += quantidades * 17.00;
                    } else if (tiposDeAlimentos == 5) {
                        preçoTotal += quantidades * 13.00;
                    }

                    System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                    System.out.println("Deseja finalizar o pedido?");
                    System.out.println("1. Sim");
                    System.out.println("2. CANCELAR PEDIDO!!!");
                    System.out.println("3. Voltar ao painel principal");
                    System.out.println("-----------------------------------------------------------------");

                    finalizarPedido = sc.nextInt();

                    if (finalizarPedido == 1) {
                        System.out.printf("Pedido Finalizado!!! Total a Pagar: R$ %.2f%n", preçoTotal);
                    } else if (finalizarPedido == 2) {
                        System.out.println("PEDIDO CANCELADO!!!");//  como "terminar" o programa no pedido cancelado???
                    }

                    if (codigoInicialDesejado == 2) {
                        System.out.println("Digite o codigo da sua bebida de sua preferencia e a quantidade:");
                        System.out.println("1. Coca 350ml: R$ 2.00");
                        System.out.println("2. Guarana Jesus 350ml: R$ 3.50");
                        System.out.println("3. Fanta Sabores 350ml : R$ 4.00");
                        System.out.println("4. Guarana Mineiro 350ml: R$ 4.00");
                        System.out.println("5. Guarana Antartica 350ml: R$ 4.00");

                        tiposDeBebidas = sc.nextInt();
                        quantidades = sc.nextInt();

                        if (tiposDeBebidas == 1) {
                            preçoTotal += quantidades * 2.00;
                        } else if (tiposDeBebidas == 2) {
                            preçoTotal += quantidades * 3.50;
                        } else if (tiposDeBebidas == 3) {
                            preçoTotal += quantidades * 4.00;
                        } else if (tiposDeBebidas == 4) {
                            preçoTotal += quantidades * 4.00;
                        } else if (tiposDeBebidas == 5) {
                            preçoTotal += quantidades * 4.00;
                        }

                        System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                        System.out.println("Deseja finalizar o pedido?");
                        System.out.println("1. Sim");
                        System.out.println("2. CANCELAR PEDIDO!!!");
                        System.out.println("3. Voltar ao painel principal");
                        System.out.println("-----------------------------------------------------------------");

                        finalizarPedido = sc.nextInt();

                    }

                    if (codigoInicialDesejado == 3) {
                        System.out.println("Digite o codigo de seu acompanhamento de sua preferencia e a quantidade:");
                        System.out.println("1. Porção de bolinhas de queijo 200g: R$ 5.00");
                        System.out.println("2. Mini-Coxinha: R$ 3.50");
                        System.out.println("3. Porção de quibe 200g: R$ 5.50");

                        tiposDeAcompanhamento = sc.nextInt();
                        quantidades = sc.nextInt();

                        if (tiposDeAcompanhamento == 1) {
                            preçoTotal += quantidades * 5.00;
                        } else if (tiposDeAcompanhamento == 2) {
                            preçoTotal += quantidades * 3.50;
                        } else if (tiposDeAcompanhamento == 3) {
                            preçoTotal += quantidades * 5.50;
                        }

                        System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                        System.out.println("Deseja finalizar o pedido?");
                        System.out.println("1. Sim");
                        System.out.println("2. CANCELAR PEDIDO!!!");
                        System.out.println("3. Voltar ao painel principal");
                        System.out.println("-----------------------------------------------------------------");

                        finalizarPedido = sc.nextInt();

                        if (finalizarPedido == 1) {
                            System.out.printf("Pedido Finalizado!!! Total a Pagar: R$ %.2f%n", preçoTotal);
                        } else if (finalizarPedido == 2) {
                            System.out.println("PEDIDO CANCELADO!!!");//  como "terminar" o programa no pedido cancelado???
                        } else if (finalizarPedido == 3) {
                            System.out.println("Olá");
                            System.out.println("Digite o codigo do que você deseja");
                            System.out.println("1. Comida");
                            System.out.println("2. Bebida");
                            System.out.println("3. Acompanhamento");
                            System.out.println("0. Para saber seu preço");
                            System.out.println("-----------------------------------------------------------------");

                            codigoInicialDesejado = sc.nextInt();

                            if (codigoInicialDesejado == 1) {
                                System.out.println("Digite o codigo da sua comida de sua preferencia e a quantidade:");
                                System.out.println("1. Bife grelhado: R$ 10.00");
                                System.out.println("2. Hamburger: R$ 13.50");
                                System.out.println("3. Feijoada: R$ 15.00");
                                System.out.println("4. Salada de frutas: R$ 17.00");
                                System.out.println("5. Sanduiche natural: R$ 13.00");

                                tiposDeAlimentos = sc.nextInt();
                                quantidades = sc.nextInt();

                                if (tiposDeAlimentos == 1) {
                                    preçoTotal += quantidades * 10.00;
                                } else if (tiposDeAlimentos == 2) {
                                    preçoTotal += quantidades * 13.5;
                                } else if (tiposDeAlimentos == 3) {
                                    preçoTotal += quantidades * 15.00;
                                } else if (tiposDeAlimentos == 4) {
                                    preçoTotal += quantidades * 17.00;
                                } else if (tiposDeAlimentos == 5) {
                                    preçoTotal += quantidades * 13.00;
                                }

                                System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                                System.out.println("Deseja finalizar o pedido?");
                                System.out.println("1. Sim");
                                System.out.println("2. CANCELAR PEDIDO!!!");
                                System.out.println("3. Voltar ao painel principal");
                                System.out.println("-----------------------------------------------------------------");

                                finalizarPedido = sc.nextInt();

                                if (finalizarPedido == 1) {
                                    System.out.printf("Pedido Finalizado!!! Total a Pagar: R$ %.2f%n", preçoTotal);
                                } else if (finalizarPedido == 2) {
                                    System.out.println("PEDIDO CANCELADO!!!");//  como "terminar" o programa no pedido cancelado???
                                } else if (finalizarPedido == 3) {
                                    System.out.println("Olá");
                                    System.out.println("Digite o codigo do que você deseja");
                                    System.out.println("1. Comida");
                                    System.out.println("2. Bebida");
                                    System.out.println("3. Acompanhamento");
                                    System.out.println("0. Para saber seu preço");
                                    System.out.println("-----------------------------------------------------------------");

                                    codigoInicialDesejado = sc.nextInt();

                                    if (codigoInicialDesejado == 1) {
                                        System.out.println("Digite o codigo da sua comida de sua preferencia e a quantidade:");
                                        System.out.println("1. Bife grelhado: R$ 10.00");
                                        System.out.println("2. Hamburger: R$ 13.50");
                                        System.out.println("3. Feijoada: R$ 15.00");
                                        System.out.println("4. Salada de frutas: R$ 17.00");
                                        System.out.println("5. Sanduiche natural: R$ 13.00");

                                        tiposDeAlimentos = sc.nextInt();
                                        quantidades = sc.nextInt();

                                        if (tiposDeAlimentos == 1) {
                                            preçoTotal += quantidades * 10.00;
                                        } else if (tiposDeAlimentos == 2) {
                                            preçoTotal += quantidades * 13.5;
                                        } else if (tiposDeAlimentos == 3) {
                                            preçoTotal += quantidades * 15.00;
                                        } else if (tiposDeAlimentos == 4) {
                                            preçoTotal += quantidades * 17.00;
                                        } else if (tiposDeAlimentos == 5) {
                                            preçoTotal += quantidades * 13.00;
                                        }

                                        System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                                        System.out.println("Deseja finalizar o pedido?");
                                        System.out.println("1. Sim");
                                        System.out.println("2. CANCELAR PEDIDO!!!");
                                        System.out.println("3. Voltar ao painel principal");
                                        System.out.println("-----------------------------------------------------------------");

                                        finalizarPedido = sc.nextInt();

                                    }

                                }

                            }

                        }

                        if (codigoInicialDesejado == 2) {
                            System.out.println("Digite o codigo da sua bebida de sua preferencia e a quantidade:");
                            System.out.println("1. Coca 350ml: R$ 2.00");
                            System.out.println("2. Guarana Jesus 350ml: R$ 3.50");
                            System.out.println("3. Fanta Sabores 350ml : R$ 4.00");
                            System.out.println("4. Guarana Mineiro 350ml: R$ 4.00");
                            System.out.println("5. Guarana Antartica 350ml: R$ 4.00");

                            tiposDeBebidas = sc.nextInt();
                            quantidades = sc.nextInt();

                            if (tiposDeBebidas == 1) {
                                preçoTotal += quantidades * 2.00;
                            } else if (tiposDeBebidas == 2) {
                                preçoTotal += quantidades * 3.50;
                            } else if (tiposDeBebidas == 3) {
                                preçoTotal += quantidades * 4.00;
                            } else if (tiposDeBebidas == 4) {
                                preçoTotal += quantidades * 4.00;
                            } else if (tiposDeBebidas == 5) {
                                preçoTotal += quantidades * 4.00;
                            }

                            System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                            System.out.println("Deseja finalizar o pedido?");
                            System.out.println("1. Sim");
                            System.out.println("2. CANCELAR PEDIDO!!!");
                            System.out.println("3. Voltar ao painel principal");
                            System.out.println("-----------------------------------------------------------------");

                            finalizarPedido = sc.nextInt();

                        }

                        if (codigoInicialDesejado == 3) {
                            System.out.println("Digite o codigo de seu acompanhamento de sua preferencia e a quantidade:");
                            System.out.println("1. Porção de bolinhas de queijo 200g: R$ 5.00");
                            System.out.println("2. Mini-Coxinha: R$ 3.50");
                            System.out.println("3. Porção de quibe 200g: R$ 5.50");

                            tiposDeAcompanhamento = sc.nextInt();
                            quantidades = sc.nextInt();

                            if (tiposDeAcompanhamento == 1) {
                                preçoTotal += quantidades * 5.00;
                            } else if (tiposDeAcompanhamento == 2) {
                                preçoTotal += quantidades * 3.50;
                            } else if (tiposDeAcompanhamento == 3) {
                                preçoTotal += quantidades * 5.50;
                            }

                            System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                            System.out.println("Deseja finalizar o pedido?");
                            System.out.println("1. Sim");
                            System.out.println("2. CANCELAR PEDIDO!!!");
                            System.out.println("3. Voltar ao painel principal");
                            System.out.println("-----------------------------------------------------------------");

                            finalizarPedido = sc.nextInt();


                        }

                        if (codigoInicialDesejado == 0) {
                            System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                        }

                        sc.close();
                    }

                    if (codigoInicialDesejado == 2) {
                        System.out.println("Digite o codigo da sua bebida de sua preferencia e a quantidade:");
                        System.out.println("1. Coca 350ml: R$ 2.00");
                        System.out.println("2. Guarana Jesus 350ml: R$ 3.50");
                        System.out.println("3. Fanta Sabores 350ml : R$ 4.00");
                        System.out.println("4. Guarana Mineiro 350ml: R$ 4.00");
                        System.out.println("5. Guarana Antartica 350ml: R$ 4.00");

                        tiposDeBebidas = sc.nextInt();
                        quantidades = sc.nextInt();

                        if (tiposDeBebidas == 1) {
                            preçoTotal += quantidades * 2.00;
                        } else if (tiposDeBebidas == 2) {
                            preçoTotal += quantidades * 3.50;
                        } else if (tiposDeBebidas == 3) {
                            preçoTotal += quantidades * 4.00;
                        } else if (tiposDeBebidas == 4) {
                            preçoTotal += quantidades * 4.00;
                        } else if (tiposDeBebidas == 5) {
                            preçoTotal += quantidades * 4.00;
                        }

                        System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                        System.out.println("Deseja finalizar o pedido?");
                        System.out.println("1. Sim");
                        System.out.println("2. CANCELAR PEDIDO!!!");
                        System.out.println("3. Voltar ao painel principal");
                        System.out.println("-----------------------------------------------------------------");

                        finalizarPedido = sc.nextInt();

                        System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                        System.out.println("Deseja finalizar o pedido?");
                        System.out.println("1. Sim");
                        System.out.println("2. CANCELAR PEDIDO!!!");
                        System.out.println("3. Voltar ao painel principal");
                        System.out.println("-----------------------------------------------------------------");

                        finalizarPedido = sc.nextInt();

                        if (finalizarPedido == 1) {
                            System.out.printf("Pedido Finalizado!!! Total a Pagar: R$ %.2f%n", preçoTotal);
                        } else if (finalizarPedido == 2) {
                            System.out.println("PEDIDO CANCELADO!!!");//  como "terminar" o programa no pedido cancelado???
                        } else if (finalizarPedido == 3) {
                            System.out.println("Olá");
                            System.out.println("Digite o codigo do que você deseja");
                            System.out.println("1. Comida");
                            System.out.println("2. Bebida");
                            System.out.println("3. Acompanhamento");
                            System.out.println("0. Para saber seu preço");
                            System.out.println("-----------------------------------------------------------------");

                            codigoInicialDesejado = sc.nextInt();

                            if (codigoInicialDesejado == 1) {
                                System.out.println("Digite o codigo da sua comida de sua preferencia e a quantidade:");
                                System.out.println("1. Bife grelhado: R$ 10.00");
                                System.out.println("2. Hamburger: R$ 13.50");
                                System.out.println("3. Feijoada: R$ 15.00");
                                System.out.println("4. Salada de frutas: R$ 17.00");
                                System.out.println("5. Sanduiche natural: R$ 13.00");

                                tiposDeAlimentos = sc.nextInt();
                                quantidades = sc.nextInt();

                                if (tiposDeAlimentos == 1) {
                                    preçoTotal += quantidades * 10.00;
                                } else if (tiposDeAlimentos == 2) {
                                    preçoTotal += quantidades * 13.5;
                                } else if (tiposDeAlimentos == 3) {
                                    preçoTotal += quantidades * 15.00;
                                } else if (tiposDeAlimentos == 4) {
                                    preçoTotal += quantidades * 17.00;
                                } else if (tiposDeAlimentos == 5) {
                                    preçoTotal += quantidades * 13.00;
                                }

                                System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                                System.out.println("Deseja finalizar o pedido?");
                                System.out.println("1. Sim");
                                System.out.println("2. CANCELAR PEDIDO!!!");
                                System.out.println("3. Voltar ao painel principal");
                                System.out.println("-----------------------------------------------------------------");

                                finalizarPedido = sc.nextInt();

                                if (finalizarPedido == 1) {
                                    System.out.printf("Pedido Finalizado!!! Total a Pagar: R$ %.2f%n", preçoTotal);
                                } else if (finalizarPedido == 2) {
                                    System.out.println("PEDIDO CANCELADO!!!");//  como "terminar" o programa no pedido cancelado???
                                }

                                if (codigoInicialDesejado == 2) {
                                    System.out.println("Digite o codigo da sua bebida de sua preferencia e a quantidade:");
                                    System.out.println("1. Coca 350ml: R$ 2.00");
                                    System.out.println("2. Guarana Jesus 350ml: R$ 3.50");
                                    System.out.println("3. Fanta Sabores 350ml : R$ 4.00");
                                    System.out.println("4. Guarana Mineiro 350ml: R$ 4.00");
                                    System.out.println("5. Guarana Antartica 350ml: R$ 4.00");

                                    tiposDeBebidas = sc.nextInt();
                                    quantidades = sc.nextInt();

                                    if (tiposDeBebidas == 1) {
                                        preçoTotal += quantidades * 2.00;
                                    } else if (tiposDeBebidas == 2) {
                                        preçoTotal += quantidades * 3.50;
                                    } else if (tiposDeBebidas == 3) {
                                        preçoTotal += quantidades * 4.00;
                                    } else if (tiposDeBebidas == 4) {
                                        preçoTotal += quantidades * 4.00;
                                    } else if (tiposDeBebidas == 5) {
                                        preçoTotal += quantidades * 4.00;
                                    }

                                    System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                                    System.out.println("Deseja finalizar o pedido?");
                                    System.out.println("1. Sim");
                                    System.out.println("2. CANCELAR PEDIDO!!!");
                                    System.out.println("3. Voltar ao painel principal");
                                    System.out.println("-----------------------------------------------------------------");

                                    finalizarPedido = sc.nextInt();

                                }

                                if (codigoInicialDesejado == 3) {
                                    System.out.println("Digite o codigo de seu acompanhamento de sua preferencia e a quantidade:");
                                    System.out.println("1. Porção de bolinhas de queijo 200g: R$ 5.00");
                                    System.out.println("2. Mini-Coxinha: R$ 3.50");
                                    System.out.println("3. Porção de quibe 200g: R$ 5.50");

                                    tiposDeAcompanhamento = sc.nextInt();
                                    quantidades = sc.nextInt();

                                    if (tiposDeAcompanhamento == 1) {
                                        preçoTotal += quantidades * 5.00;
                                    } else if (tiposDeAcompanhamento == 2) {
                                        preçoTotal += quantidades * 3.50;
                                    } else if (tiposDeAcompanhamento == 3) {
                                        preçoTotal += quantidades * 5.50;
                                    }

                                    System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                                    System.out.println("Deseja finalizar o pedido?");
                                    System.out.println("1. Sim");
                                    System.out.println("2. CANCELAR PEDIDO!!!");
                                    System.out.println("3. Voltar ao painel principal");
                                    System.out.println("-----------------------------------------------------------------");

                                    finalizarPedido = sc.nextInt();

                                }

                            }

                        }

                        if (codigoInicialDesejado == 2) {
                            System.out.println("Digite o codigo da sua bebida de sua preferencia e a quantidade:");
                            System.out.println("1. Coca 350ml: R$ 2.00");
                            System.out.println("2. Guarana Jesus 350ml: R$ 3.50");
                            System.out.println("3. Fanta Sabores 350ml : R$ 4.00");
                            System.out.println("4. Guarana Mineiro 350ml: R$ 4.00");
                            System.out.println("5. Guarana Antartica 350ml: R$ 4.00");

                            tiposDeBebidas = sc.nextInt();
                            quantidades = sc.nextInt();

                            if (tiposDeBebidas == 1) {
                                preçoTotal += quantidades * 2.00;
                            } else if (tiposDeBebidas == 2) {
                                preçoTotal += quantidades * 3.50;
                            } else if (tiposDeBebidas == 3) {
                                preçoTotal += quantidades * 4.00;
                            } else if (tiposDeBebidas == 4) {
                                preçoTotal += quantidades * 4.00;
                            } else if (tiposDeBebidas == 5) {
                                preçoTotal += quantidades * 4.00;
                            }

                            System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                            System.out.println("Deseja finalizar o pedido?");
                            System.out.println("1. Sim");
                            System.out.println("2. CANCELAR PEDIDO!!!");
                            System.out.println("3. Voltar ao painel principal");
                            System.out.println("-----------------------------------------------------------------");

                            finalizarPedido = sc.nextInt();

                        }

                        if (codigoInicialDesejado == 3) {
                            System.out.println("Digite o codigo de seu acompanhamento de sua preferencia e a quantidade:");
                            System.out.println("1. Porção de bolinhas de queijo 200g: R$ 5.00");
                            System.out.println("2. Mini-Coxinha: R$ 3.50");
                            System.out.println("3. Porção de quibe 200g: R$ 5.50");

                            tiposDeAcompanhamento = sc.nextInt();
                            quantidades = sc.nextInt();

                            if (tiposDeAcompanhamento == 1) {
                                preçoTotal += quantidades * 5.00;
                            } else if (tiposDeAcompanhamento == 2) {
                                preçoTotal += quantidades * 3.50;
                            } else if (tiposDeAcompanhamento == 3) {
                                preçoTotal += quantidades * 5.50;
                            }

                            System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                            System.out.println("Deseja finalizar o pedido?");
                            System.out.println("1. Sim");
                            System.out.println("2. CANCELAR PEDIDO!!!");
                            System.out.println("3. Voltar ao painel principal");
                            System.out.println("-----------------------------------------------------------------");

                            finalizarPedido = sc.nextInt();

                        }

                        if (codigoInicialDesejado == 0) {
                            System.out.printf("O preço total é de R$ %.2f%n", preçoTotal);
                        }

                        sc.close();
                    }

                }
            }
        }

    }
}